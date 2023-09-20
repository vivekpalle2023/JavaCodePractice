package com.example.springweb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import com.example.springweb.model.Product;

@SpringBootTest
class Productrestapi1ApplicationTests {

	@Test
	void testGetProducts() {
		RestTemplate restTemplate=new RestTemplate();
		Product product=restTemplate.getForObject("http://localhost:8080/productapi/product/3", Product.class);
		assertEquals("Samsung", product.getName());
	}
	
	@Test
	void testCreateProducts() {
		
		RestTemplate restTemplate=new RestTemplate();
		Product product=new Product();
		product.setName("iPhone");
		product.setDescription("Awesome Phone");
		product.setPrice(10000);
		//Initially adding the details to product object then inserting or creating the product details using uri
		//using postForObject we are capturing the inserted details then asserting or testing
	
		Product newProduct=restTemplate.postForObject("http://localhost:8080/productapi/products", product, Product.class);
		//assertNotNull(newProduct);
		assertEquals(newProduct.getName(), "iPhone");
		
	}
	
	@Test
	void testupdateProduct()
	{
		RestTemplate restTemplate=new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/product/5", Product.class);
		product.setPrice(90000);
		restTemplate.put("http://localhost:8080/productapi/products", product);
		
	}

}
