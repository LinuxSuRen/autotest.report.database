package com.surenpi.autotest.report.database.dao;

import org.springframework.data.repository.CrudRepository;

import com.surenpi.autotest.report.database.entity.Report;

/**
 * @author suren
 */
public interface ReportDao extends CrudRepository<Report, Integer>
{
}
