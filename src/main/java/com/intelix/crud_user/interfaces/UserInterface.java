package com.intelix.crud_user.interfaces;

import java.util.Optional;

import com.intelix.crud_user.entities.User;

public interface UserInterface extends CrudInterface<User> {
    Optional<User> getByEmail(String email);

    Optional<User> getByUsername(String username);
    
}
