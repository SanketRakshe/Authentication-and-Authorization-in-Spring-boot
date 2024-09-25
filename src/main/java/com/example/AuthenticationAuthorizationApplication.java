package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationAuthorizationApplication.class, args);
		System.out.println("Started");
	}

}
