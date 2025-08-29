package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity_users.User;


@RestController
public class Controller {

    @GetMapping("/fetchUsers")
    public List<User> getUsers(){
        return
    }
}
