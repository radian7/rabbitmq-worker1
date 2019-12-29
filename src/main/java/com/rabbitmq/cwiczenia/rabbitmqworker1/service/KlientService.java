package com.rabbitmq.cwiczenia.rabbitmqworker1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.KlientJPARepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;

@Service
public class KlientService {
	
	@Autowired
	KlientJPARepository klientJPARepository;
	
	public CkkKlienci findByKlKod( Long kodCKK ) {
		return klientJPARepository.findByKlKod(kodCKK);
	}
	
}
