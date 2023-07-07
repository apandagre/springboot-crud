package com.crudproject.cruddemo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("No user exists with id " + id);
    }
}
