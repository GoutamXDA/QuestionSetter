package com.sample.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.microservice.dto.QuestionDTO;
import com.sample.microservice.dto.RestServiceResponse;

@RestController
public class QuestionController {
	public ResponseEntity<RestServiceResponse> getQuestionByID(@PathVariable String id) {
		return null;
	}

	public ResponseEntity<RestServiceResponse> deleteQuestion(@PathVariable String id) {
		return null;
	}

	public ResponseEntity<RestServiceResponse> saveQuestion(@RequestBody QuestionDTO questionDTO) {
		return null;
	}

	public ResponseEntity<RestServiceResponse> searchQuestions() {
		return null;
	}

}
