package com.shashank.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPIApp {
	public static void main(String args[]) {
		SpringApplication.run(CourseAPIApp.class, args);
	}
}

// This is the main class to trigger the application,
// Once it starts, Spring class path scan starts looking for classes


