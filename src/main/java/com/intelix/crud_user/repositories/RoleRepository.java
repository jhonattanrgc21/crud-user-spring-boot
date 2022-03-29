package com.intelix.crud_user.repositories;

import com.intelix.crud_user.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
