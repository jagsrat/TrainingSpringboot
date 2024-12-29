package com.example.springbootDemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootDemo.entity.DemoUser;


public interface UserRepository extends JpaRepository<DemoUser, Long> {
}