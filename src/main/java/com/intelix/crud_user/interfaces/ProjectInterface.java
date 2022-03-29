package com.intelix.crud_user.interfaces;

import java.util.Optional;

import com.intelix.crud_user.entities.Project;

public interface ProjectInterface  extends CrudInterface<Project>{
    Optional<Project> getByName(String name);
}
