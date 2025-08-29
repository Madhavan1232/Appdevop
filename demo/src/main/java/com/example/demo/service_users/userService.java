package com.example.demo.service_users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_users.User;
import com.example.demo.repository.RepoUser;

@Service
public class userService {

    @Autowired
    private RepoUser repo;

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public String add(User obj) {
        repo.save(obj);
        return "User added";    
    }
}
