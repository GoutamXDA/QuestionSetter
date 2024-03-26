package com.sample.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
	@GetMapping("/api/v1/greeting")
	public String greeting() {
		return "Hello World";
	}
}
