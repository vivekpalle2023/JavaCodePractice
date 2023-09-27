package com.example.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Arrays;

import com.example.springweb.repos.ProductRepository;
import com.example.springweb.model.Product;

public class ProductRestControllerMvcTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductRepository productRepository;
	
	@Test
	private void testFindAll()
	{
		Product product=new Product();
		product.setId(1);
		product.setName("Mac Book");
		product.setDescription("Good Phone");
		product.setPrice(10000);
		List<Product> products = Arrays.asList(product);
		when(productRepository.findAll()).thenReturn(products);
	}
}
