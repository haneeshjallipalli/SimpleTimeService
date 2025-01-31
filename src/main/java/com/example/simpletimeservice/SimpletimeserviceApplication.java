package com.example.simpletimeservice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

// Main class to bootstrap the Spring Boot application
@SpringBootApplication
@RestController // This annotation marks this class as a REST controller, allowing it to handle HTTP requests
public class SimpletimeserviceApplication {

	// This is the main method to launch the Spring Boot application
	public static void main(String[] args) {

		SpringApplication.run(SimpletimeserviceApplication.class, args);
	}
	// Handles GET requests to the root ("/") URL
	@GetMapping("/")
	public Map<String, String> getTime(HttpServletRequest request) {
		return Map.of(
				// Returns the current timestamp
				"timestamp", Instant.now().toString(),
				// Returns the IP address of the request sender
				"ip", request.getRemoteAddr()
		);
	}
}