package com.example.springbootDemo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.springbootDemo.entity.DemoUser;
import com.example.springbootDemo.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<DemoUser> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public DemoUser createUser(@RequestBody DemoUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public DemoUser getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PutMapping("/{id}")
    public DemoUser updateUser(@PathVariable Long id, @RequestBody DemoUser userDetails) {
    	DemoUser user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}