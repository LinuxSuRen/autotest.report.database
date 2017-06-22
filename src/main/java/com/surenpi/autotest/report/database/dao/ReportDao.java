package com.surenpi.autotest.report.database.dao;

import com.surenpi.autotest.report.database.entity.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author suren
 */
public interface ReportDao extends CrudRepository<Report, Integer>
{
}
