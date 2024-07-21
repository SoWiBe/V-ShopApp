package com.example.vbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.example.vbackend")
public class VbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VbackendApplication.class, args);
	}

}
