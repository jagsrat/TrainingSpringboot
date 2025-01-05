package com.example.springbootDemo.repository;

import com.example.springbootDemo.entity.demoMYSQLUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface mySQLDemoUserRepository extends JpaRepository<demoMYSQLUser, Long> {
	Page<demoMYSQLUser> finfByEmail(String email , Pageable pageable);// Pagination and sorting by category
}

