package com.yousef.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	@RequestMapping("/name")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "Welcome " + searchQuery + "!";
    }
	@RequestMapping("/")
	public String coding() {
		return "Hello Human!";
	}
	
}
