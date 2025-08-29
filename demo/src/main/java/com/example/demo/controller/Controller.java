package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity_users.User;
import com.example.demo.service_users.userService;


@RestController
public class Controller {

    private userService service;

    @GetMapping("/fetchUsers")
    public List<User> getUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public String addUsers(@RequestBody User addUser){
        return service.add(addUser);
    }
}
