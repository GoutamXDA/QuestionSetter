package com.sample.microservice.service;

import java.util.List;

import com.sample.microservice.dto.QuestionDTO;

public class QuestionServiceImpl implements QuestionService {

	@Override
	public QuestionDTO getQuestionById(String id) {
		return null;
	}

	@Override
	public boolean deleteQuestion(String id) {
		return false;
	}

	@Override
	public QuestionDTO saveQuestion(QuestionDTO questionDTO) {
		return null;
	}

	@Override
	public List<QuestionDTO> searchQuestions() {
		return null;
	}

}
