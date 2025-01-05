package com.example.springbootDemo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class demoMYSQLUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "Name is mandatory")
    private String name;
	
	
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email should be valid")
    private String email;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setname(String name)
    {
    	this.name = name;
    }
    
    public String getname()
    {
    	return this.name;
    }
    
    public void setemail(String email)
    {
    	this.email = email;
    }
    
    public String getemail()
    {
    
    return this.email;
    }
    
    
    
    
}
