package com.sample.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.microservice.dto.QuestionDTO;
import com.sample.microservice.dto.RestServiceResponse;

@RestController
@RequestMapping("/api/v1/quetion")
public class QuestionController {

	@GetMapping("/{id}")
	public ResponseEntity<RestServiceResponse> getQuestionByID(@PathVariable String id) {
		return ResponseEntity.ok().body(getSuccessResponse("Fetched succesfully"));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<RestServiceResponse> deleteQuestion(@PathVariable String id) {
		return ResponseEntity.ok().body(getSuccessResponse("Deleted succesfully"));
	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<RestServiceResponse> saveQuestion(@RequestBody QuestionDTO questionDTO) {
		return ResponseEntity.ok().body(getSuccessResponse("Saved succesfully"));
	}

	@PostMapping(value = "/search", consumes = "application/json")
	public ResponseEntity<RestServiceResponse> searchQuestions() {
		return ResponseEntity.ok().body(getSuccessResponse("search results returned"));
	}

}
