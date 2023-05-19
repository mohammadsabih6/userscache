package com.example.userscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class UserscacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserscacheApplication.class, args);
	}

}
