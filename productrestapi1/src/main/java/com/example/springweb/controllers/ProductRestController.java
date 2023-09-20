package com.example.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springweb.model.Product;
import com.example.springweb.repos.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	ProductRepository repository;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@RequestMapping(value = "/product/{Id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("Id") int Id) {
		return repository.findById(Id).get();
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);

	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id)
	{
		 repository.deleteById(id);
	}
	
	

}
