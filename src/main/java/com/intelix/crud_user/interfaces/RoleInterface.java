package com.intelix.crud_user.interfaces;

import java.util.Optional;

import com.intelix.crud_user.entities.Role;

public interface RoleInterface extends CrudInterface<Role> {
    Optional<Role> getByName(String name);
}
