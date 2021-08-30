package com.mproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MonitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitProjectApplication.class, args);
		System.out.println("Hello World");
		
	}

}
