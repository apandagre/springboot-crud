package com.crudproject.cruddemo.controller;

import com.crudproject.cruddemo.exception.UserNotFoundException;
import com.crudproject.cruddemo.model.User;
import com.crudproject.cruddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
    }
}
