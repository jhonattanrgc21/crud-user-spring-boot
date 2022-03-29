package com.intelix.crud_user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.intelix.crud_user.entities.User;
import com.intelix.crud_user.interfaces.UserInterface;
import com.intelix.crud_user.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public User create(User entity) {
        return this.userRepository.save(entity);
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users = this.userRepository.findAll();
        return users;
    }

    @Override
    public Optional<User> getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<User> getByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User update(long id, User entity) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
