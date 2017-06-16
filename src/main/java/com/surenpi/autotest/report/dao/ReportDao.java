package com.surenpi.autotest.report.dao;

import com.surenpi.autotest.report.entity.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author suren
 */
@Repository
public interface ReportDao extends CrudRepository<Report, Integer>
{
}
