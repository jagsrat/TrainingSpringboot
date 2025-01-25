package com.example.springbootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springbootDemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE " +
		       "(:category IS NULL OR p.category = :category) AND " +
		       "(:minPrice IS NULL OR p.price >= :minPrice) AND " +
		       "(:maxPrice IS NULL OR p.price <= :maxPrice)")
		List<Product> filterProducts(
		        @Param("category") String category,
		        @Param("minPrice") Double minPrice,
		        @Param("maxPrice") Double maxPrice);
}