package com.sample.microservice.service;

import java.util.List;

import com.sample.microservice.dto.QuestionDTO;

public interface QuestionService {
	public QuestionDTO getQuestionById(final String id);

	public boolean deleteQuestion(final String id);

	public QuestionDTO saveQuestion(final QuestionDTO questionDTO);

	public List<QuestionDTO> searchQuestions();

}
