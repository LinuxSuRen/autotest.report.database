package com.surenpi.autotest.report.database.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.surenpi.autotest.report.database.writer.ReportDataBaseContext;
import com.surenpi.autotest.report.database.writer.WriterConfigruation;

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
