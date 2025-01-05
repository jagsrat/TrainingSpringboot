package com.example.springbootDemo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springbootDemo.entity.demoMYSQLUser;
import com.example.springbootDemo.repository.mySQLDemoUserRepository;

import java.util.List;

@RestController
@RequestMapping("/mysqlusers")
public class MYSQLUserController {

    @Autowired
    private mySQLDemoUserRepository userRepository;

    @PostMapping
    public demoMYSQLUser createUser(@RequestBody demoMYSQLUser user) {
        return userRepository.save(user);
    }
    
    

    @GetMapping
    public List<demoMYSQLUser> getAllUsers() {
        return userRepository.findAll();
    }
}