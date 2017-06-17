package com.surenpi.autotest.report.dao;

import com.surenpi.autotest.report.entity.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * @author suren
 */
public interface ProjectDao extends CrudRepository<Project, Integer>
{
}
