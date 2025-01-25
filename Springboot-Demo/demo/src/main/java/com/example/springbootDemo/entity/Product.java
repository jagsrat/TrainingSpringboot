package com.example.springbootDemo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private String category;

    @Column(name = "created_date")
    private LocalDate createdDate;

    // Getters and Setters
    
    public String getname(){
    	return this.name;
    }
    
    public Double getprice() {
    	return this.price;
    }
    
    public String getcategory() {
    	return this.category;
    }
    
    public LocalDate getcreatedDate() {
    	return this.createdDate;
    }
    
    public void setname(String name){
    	this.name = name;
    }
    
    public void setprice(Double price) {
    	this.price=price;
    }
    
    public void setcategory(String category) {
    	this.category=category;
    }
    
    public void setcreatedDate(LocalDate createdDate) {
    	this.createdDate=createdDate;
    }
}