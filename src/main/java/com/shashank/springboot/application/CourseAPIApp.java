package com.shashank.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This is the main class to trigger the application,
//Once it starts, Spring class path scan starts looking for classes
//test comment 1
// 
@SpringBootApplication
public class CourseAPIApp {
	public static void main(String args[]) {
		SpringApplication.run(CourseAPIApp.class, args);
	}
}
