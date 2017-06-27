package com.surenpi.autotest.report.database.dao;

import org.springframework.data.repository.CrudRepository;

import com.surenpi.autotest.report.database.entity.Project;

/**
 * @author suren
 */
public interface ProjectDao extends CrudRepository<Project, Integer>
{
}
