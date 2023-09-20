package com.example.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springweb.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
