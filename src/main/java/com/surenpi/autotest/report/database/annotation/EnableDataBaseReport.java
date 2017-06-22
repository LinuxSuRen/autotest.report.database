package com.surenpi.autotest.report.database.annotation;

import com.surenpi.autotest.report.database.writer.ReportDataBaseContext;
import com.surenpi.autotest.report.database.writer.WriterConfigruation;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author suren
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ReportDataBaseContext.class, WriterConfigruation.class})
public @interface EnableDataBaseReport
{
}
