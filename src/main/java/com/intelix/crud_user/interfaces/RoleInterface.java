package com.intelix.crud_user.interfaces;

import com.intelix.crud_user.entities.Role;

import java.util.List;

public interface RoleInterface {
    Role create(Role role);

    Role update(long id, Role role);

    List<Role> getAll();

    Role getById(long id);

    Role getByName();

    void delete(long id);
}
