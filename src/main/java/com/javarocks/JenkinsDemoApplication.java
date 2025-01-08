package com.javarocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	@GetMapping("/")
	public String test(){
		return "Jenkins Demo";
	}

}
