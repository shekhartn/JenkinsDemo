package com.javarocks;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;


@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

	public static Logger log= LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void init(){
		log.info("Project Initiated");
	}

	public static void main(String[] args) {
		log.info("Jenkins Project Started....");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}


	@GetMapping("/")
	public String test(){
		log.info("Jenkins Demo First API....");
		return "Jenkins Demo";
	}

}
