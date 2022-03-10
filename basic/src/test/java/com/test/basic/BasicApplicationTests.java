package com.test.basic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootTest
class BasicApplicationTests {


	@GetMapping(value="/test")
	public String aaa(){
		return "asd";
	}

	@Test
	void contextLoads() {
	}

}
