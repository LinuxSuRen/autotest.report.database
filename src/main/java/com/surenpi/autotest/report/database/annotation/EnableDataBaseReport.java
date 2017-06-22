package com.surenpi.autotest.report.database.annotation;

import com.surenpi.autotest.report.database.writer.ReportDatabaseContext;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author suren
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ReportDatabaseContext.class)
public @interface EnableDataBaseReport
{
}
