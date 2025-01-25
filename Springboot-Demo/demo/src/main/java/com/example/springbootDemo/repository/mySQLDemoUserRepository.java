package com.example.springbootDemo.repository;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.springbootDemo.entity.demoMYSQLUser;

public interface mySQLDemoUserRepository extends JpaRepository<demoMYSQLUser, Long> , JpaSpecificationExecutor<demoMYSQLUser>{
	
	


	Page<demoMYSQLUser> findByemail(String email, Pageable pageable);

	List<demoMYSQLUser> findByemail(String email);
}

