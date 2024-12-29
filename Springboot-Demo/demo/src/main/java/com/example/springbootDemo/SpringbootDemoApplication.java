package com.example.springbootDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springbootDemo.entity.DemoUser;
import com.example.springbootDemo.repository.UserRepository;


@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
    
    
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            userRepository.save(new DemoUser("John Doe", "john.doe@example.com"));
            userRepository.save(new DemoUser("Jane Smith", "jane.smith@example.com"));
        };
}
}