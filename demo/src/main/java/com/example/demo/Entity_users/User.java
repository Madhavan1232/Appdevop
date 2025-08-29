package com.example.demo.Entity_users;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    
    @Id
    private Integer userId;
    private String userName;


}
