package com.surenpi.autotest.report;

import com.surenpi.autotest.report.dao.ProjectDao;
import com.surenpi.autotest.report.dao.ReportDao;
import com.surenpi.autotest.report.entity.Project;
import com.surenpi.autotest.report.entity.Report;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.suren.autotest.web.framework.report.RecordReportWriter;
import org.suren.autotest.web.framework.report.record.ExceptionRecord;
import org.suren.autotest.web.framework.report.record.NormalRecord;
import org.suren.autotest.web.framework.report.record.ProjectRecord;

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
        Report report = mapper.map(exceptionRecord, Report.class);
        report.setStatus("exception");
        report.setDetail(exceptionRecord.getThrowable().getMessage());
        report.setProjectId(projectId);

        reportDao.save(report);
    }

    @Override
    public void write(NormalRecord normalRecord)
    {
        ModelMapper mapper = new ModelMapper();
        Report report = mapper.map(normalRecord, Report.class);
        report.setStatus("normal");
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
