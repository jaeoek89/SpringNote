package com.test.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BasicApplication {

	@GetMapping(value="/test")
	public String aaa(){
		return "asd";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}
