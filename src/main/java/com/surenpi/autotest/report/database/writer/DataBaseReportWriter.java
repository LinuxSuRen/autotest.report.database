package com.surenpi.autotest.report.database.writer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.surenpi.autotest.report.RecordReportWriter;
import com.surenpi.autotest.report.ReportStatus;
import com.surenpi.autotest.report.database.dao.ProjectDao;
import com.surenpi.autotest.report.database.dao.ReportDao;
import com.surenpi.autotest.report.database.entity.Project;
import com.surenpi.autotest.report.database.entity.Report;
import com.surenpi.autotest.report.record.ExceptionRecord;
import com.surenpi.autotest.report.record.NormalRecord;
import com.surenpi.autotest.report.record.ProjectRecord;

/**
 * @author suren
 */
public class DataBaseReportWriter implements RecordReportWriter
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
