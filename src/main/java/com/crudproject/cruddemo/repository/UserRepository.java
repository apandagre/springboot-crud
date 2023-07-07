package com.crudproject.cruddemo.repository;

import com.crudproject.cruddemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
