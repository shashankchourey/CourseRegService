package com.shashank.springboot.application.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This is a Rest Controller for the Business Hello Class with request mappings 
@RestController
public class BusinessHelloController {

	@RequestMapping("/hello")
	public String orgHi() {
		return "Welcome to Amazon Business!";
	}
	
	@RequestMapping("/status")
	public String orgStatus() {
		return "We are verifying your business. We will get back to you soon!";
	}	
	
}

