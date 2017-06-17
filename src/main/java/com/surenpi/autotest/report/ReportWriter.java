package com.surenpi.autotest.report;

import com.surenpi.autotest.report.dao.ProjectDao;
import com.surenpi.autotest.report.dao.ReportDao;
import com.surenpi.autotest.report.entity.Project;
import com.surenpi.autotest.report.entity.Report;
import com.surenpi.autotest.report.record.ExceptionRecord;
import com.surenpi.autotest.report.record.NormalRecord;
import com.surenpi.autotest.report.record.ProjectRecord;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author suren
 */
@Component
public class ReportWriter implements RecordReportWriter
{
    @Autowired
    private ReportDao reportDao;
    @Autowired
    private ProjectDao projectDao;

    private String projectId;

    @Override
    public void write(ExceptionRecord exceptionRecord)
    {
        ModelMapper mapper = new ModelMapper();
        Report report = mapper.map(exceptionRecord.getNormalRecord(), Report.class);
        report.setStatus(ReportStatus.EXCEPTION.name());
        report.setDetail(exceptionRecord.getStackTraceText());
        report.setProjectId(projectId);

        reportDao.save(report);
    }

    @Override
    public void write(NormalRecord normalRecord)
    {
        ModelMapper mapper = new ModelMapper();
        Report report = mapper.map(normalRecord, Report.class);
        report.setStatus(ReportStatus.NORMAL.name());
        report.setProjectId(projectId);

        reportDao.save(report);
    }

    @Override
    public void write(ProjectRecord projectRecord)
    {
        ModelMapper mapper = new ModelMapper();
        Project project = mapper.map(projectRecord, Project.class);

        projectDao.save(project);

        projectId = project.getId();
    }
}
