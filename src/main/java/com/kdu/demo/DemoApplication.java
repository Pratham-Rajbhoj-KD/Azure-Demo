package com.kdu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
class HelloController {
	@GetMapping("/")
	public String index() {
		return "Hello Prathamesh Rajbhoj, KD-24 batch (Azure)";
	}
}

@RestController
class HelloController1 {
	@GetMapping("/hello")
	public String index() {
		return "Hello Prathamesh Rajbhoj, KD-24 batch (CLI)";
	}
}

