package com.question.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;
	


	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
	}

}
