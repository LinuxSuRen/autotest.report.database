package com.surenpi.autotest.report.database.writer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surenpi.autotest.report.RecordReportWriter;

/**
 * @author suren
 */
@Configuration
public class WriterConfigruation
{
    @Bean
    public RecordReportWriter createRecordReportWriter()
    {
        return new DataBaseReportWriter();
    }
}
