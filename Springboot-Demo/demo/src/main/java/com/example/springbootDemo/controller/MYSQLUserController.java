package com.example.springbootDemo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.springbootDemo.entity.demoMYSQLUser;
import com.example.springbootDemo.repository.mySQLDemoUserRepository;
import com.example.springbootDemo.service.mySQLUserService;

import java.util.List;

@RestController
@RequestMapping("/mysqlusers")
public class MYSQLUserController {

    @Autowired
    private mySQLDemoUserRepository mysqluserRepository;

    @PostMapping
    public demoMYSQLUser createUser(@RequestBody demoMYSQLUser user) {
        return mysqluserRepository.save(user);
    }
    
    

    @GetMapping
    public List<demoMYSQLUser> getAllUsers() {
        return mysqluserRepository.findAll();
    }
    
    
   @Autowired
   private mySQLUserService mySQLUserServiceobj;
    
    @GetMapping("/page")
    public Page<demoMYSQLUser> getPagedEmail(
            @RequestParam(required = false) String email,
            @RequestParam(required = false) int page,
            @RequestParam(required = false) int size,
            @RequestParam(required = false) String sortBy
        ) {
            return mySQLUserServiceobj.getPagedEmail(email, page, size, sortBy);
        }
    
    
    
    
    @GetMapping("/filtered")
    public List<demoMYSQLUser> getFilteredEmail(
        @RequestParam String email
    ) {
        return mySQLUserServiceobj.getFilteredEmail(email);
    }
    
}