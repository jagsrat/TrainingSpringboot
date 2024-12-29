package com.example.springbootDemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHelloMessage() {
        return "Hello from the Service Layer!";
    }
}