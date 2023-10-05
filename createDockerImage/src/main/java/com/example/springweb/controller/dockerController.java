package com.example.springweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {
	
	@Value("${server.port}")
private String getPortNumber;
		
	@RequestMapping("/hello")
	@ResponseBody
public String hello() {
	return getPortNumber;
}



	
}
