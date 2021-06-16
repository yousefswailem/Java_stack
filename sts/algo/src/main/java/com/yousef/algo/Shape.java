package com.yousef.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public abstract class  Shape {
	private String color;
	public static void main(String[] args) {
		SpringApplication.run(Shape.class, args);
	}
	public double getArea() {
		return 1.1;
	}
	@Override
	public String toString() {
		return "Shape [toString()=" + super.toString() + "]";
	}

}
