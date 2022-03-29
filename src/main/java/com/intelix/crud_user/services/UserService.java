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
        this.userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users = this.userRepository.findAll();
        return users;
    }

    @Override
    public User getById(long id) {
        return this.userRepository.getById(id);
    }

    @Override
    public User update(long id, User entity) {
        User user = this.userRepository.getById(id);
        user.setEmail(
                !entity.getEmail().isEmpty() && entity.getEmail() != null ? entity.getEmail() : user.getEmail());
        user.setFirstName(
                !entity.getFirstName().isEmpty() && entity.getFirstName() != null ? entity.getFirstName()
                        : user.getFirstName());
        user.setLastName(!entity.getLastName().isEmpty() && entity.getLastName() != null ? entity.getLastName()
                : user.getLastName());
        user.setUsername(!entity.getUsername().isEmpty() && entity.getUsername() != null ? entity.getUsername()
                : user.getUsername());
        this.userRepository.save(user);
        return user;
    }

}
