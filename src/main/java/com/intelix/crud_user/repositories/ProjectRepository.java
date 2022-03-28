package com.intelix.crud_user.repositories;

import com.intelix.crud_user.entities.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
