package com.BikkadIt.mini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.mini.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
