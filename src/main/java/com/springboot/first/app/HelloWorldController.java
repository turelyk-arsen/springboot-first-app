package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	
	// REST get post put delete
	
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World !!!  Learn Spring Boot";
	}

}
