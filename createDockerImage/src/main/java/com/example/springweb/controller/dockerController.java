package com.example.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {
	
	@RequestMapping("/hello")
	@ResponseBody
public String hello() {
	return "Hello Vivek!";
}

}
