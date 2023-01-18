package com.example.mongockaot;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class MongockAotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongockAotApplication.class, args);
	}

}
