package com.example.demo;

import com.example.demo.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
		return String.format("Hello %s!, ", name);
	}

	@GetMapping("/fileinfo")
	public String fileInfo(){
		String file = "C:\\Users\\aleks\\OneDrive\\Рабочий стол\\javafile.txt";
		StringBuilder stringBuilder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
			for (String s : lines){
				stringBuilder.append(s);
			}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

		return stringBuilder.toString();
	}


}
