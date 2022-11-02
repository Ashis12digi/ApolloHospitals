package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"com.example.demo.controller","com.example.demo.pojo",
		"com.example.demo.repository","com.example.demo.service",})
public class ApolloHospitalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloHospitalsApplication.class, args);
	}
	
	

}