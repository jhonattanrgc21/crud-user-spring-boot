package com.intelix.crud_user.controllers;

import com.intelix.crud_user.entities.User;

import com.intelix.crud_user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServices;

    @RequestMapping(method = RequestMethod.POST, value = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<> (this.userServices.create(user), HttpStatus.CREATED);
    }
}
