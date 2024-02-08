package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringbootLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoginAppApplication.class, args);
		System.out.println("Spring Boot is up!");
	}

}

