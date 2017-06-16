package com.surenpi.autotest;

import com.surenpi.autotest.dao.ReportDao;
import com.surenpi.autotest.entity.Report;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.report.RecordReportWriter;
import org.suren.autotest.web.framework.report.record.ExceptionRecord;
import org.suren.autotest.web.framework.report.record.NormalRecord;

/**
 * @author suren
 */
@Component
public class ReportWriter implements RecordReportWriter
{
    @Autowired
    private ReportDao reportDao;

    @Override
    public void write(ExceptionRecord record)
    {
    }

    @Override
    public void write(NormalRecord normalRecord)
    {
        ModelMapper mapper = new ModelMapper();
        Report report = mapper.map(normalRecord, Report.class);
        report.setId((int)System.currentTimeMillis());

        reportDao.save(report);
    }
}
