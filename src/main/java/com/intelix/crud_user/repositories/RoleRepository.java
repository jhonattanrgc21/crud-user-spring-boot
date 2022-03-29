package com.intelix.crud_user.repositories;

import java.util.List;

import com.intelix.crud_user.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findByName(String name);
}
