package com.example.springweb.controllers;
import com.example.springweb.entities.Product;
import com.example.springweb.repos.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;

	@RequestMapping(value="/products", method =RequestMethod.GET )
	public List<Product> getProduct(){
		
		return repository.findAll();
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
		
	}

	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
//'Save' method will check has product has id in it. If it is having id in it, it will update else it will insert
	
	@RequestMapping (value="/products", method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
	}

}
