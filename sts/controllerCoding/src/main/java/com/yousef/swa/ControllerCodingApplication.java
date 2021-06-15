package com.yousef.swa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class ControllerCodingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ControllerCodingApplication.class, args);
	}
	@RequestMapping("/dojo")
	public String coding() {
		return "theDojoisawsome";
	}
	@RequestMapping("/burbank-dojo")
	public String python() {
		return "Burbank Dojo is located in Southern California!";
	}
	@RequestMapping("/san-jose")
	public String java() {
		return "SJ dojo is the headquarters";
	}

}


