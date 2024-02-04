package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class NexusPortfolioApplication {

	// The main class for starting the Spring Boot application

	public static void main(String[] args) {
		// SpringApplication.run() method launches the Spring Boot application
		SpringApplication.run(NexusPortfolioApplication.class, args);
	}

}
