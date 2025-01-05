package com.example.springbootDemo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springbootDemo.entity.demoMYSQLUser;
import com.example.springbootDemo.repository.mySQLDemoUserRepository;

@Service
public class mySQLUserService {
	
	@Autowired
	private mySQLDemoUserRepository mySQLDemoUserRepositoryobj;
	
	public Page<demoMYSQLUser> getPagedEmail(String email, int page, int size, String sortBy) {
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return mySQLDemoUserRepositoryobj.findByemail(email,pageable);
    }
	
	
	public List<demoMYSQLUser> getFilteredEmail(String email) {
        return mySQLDemoUserRepositoryobj.findByemail(email);
    }


	

}
