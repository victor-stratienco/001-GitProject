package com.springapp.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.mvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
