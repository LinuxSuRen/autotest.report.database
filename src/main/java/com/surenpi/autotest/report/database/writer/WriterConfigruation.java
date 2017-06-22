package com.surenpi.autotest.report.database.writer;

import com.surenpi.autotest.report.RecordReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
