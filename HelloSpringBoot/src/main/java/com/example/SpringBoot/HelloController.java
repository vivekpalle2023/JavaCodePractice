package com.example.SpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	
	HelloRepos hellorepos;
	
	//Tomcat is used to building and maintain the Web applications. 
	//SB has embedded Tomcat to take care of it 
	
	@GetMapping("/hello")
	public List<HelloEntity> Hello() {
		
		return hellorepos.findAll();
	}

}
