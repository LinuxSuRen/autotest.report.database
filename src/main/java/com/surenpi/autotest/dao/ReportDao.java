package com.surenpi.autotest.dao;

import com.surenpi.autotest.entity.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author suren
 */
@Repository
public interface ReportDao extends CrudRepository<Report, Integer>
{
}
