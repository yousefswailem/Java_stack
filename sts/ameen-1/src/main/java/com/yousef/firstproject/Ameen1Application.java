package com.yousef.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ameen1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ameen1Application.class, args);
	}
	@RequestMapping("/")
	public String greeting() {
		return "greeting";
	}
	
	@RequestMapping("/random")
	public String hello() {
		return "Welcome there";
	}

}
