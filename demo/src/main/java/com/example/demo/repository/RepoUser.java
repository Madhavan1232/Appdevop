
 package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity_users.User;

@Repository
public interface RepoUser extends JpaRepository<User , Integer>{}