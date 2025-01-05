package com.example.springbootDemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootDemo.entity.DemoUser;

@Repository
public interface UserRepository extends JpaRepository<DemoUser, Long> {
}