package com.surenpi.autotest.report.database.dao;

import com.surenpi.autotest.report.database.entity.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * @author suren
 */
public interface ProjectDao extends CrudRepository<Project, Integer>
{
}
