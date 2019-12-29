package com.rabbitmq.cwiczenia.rabbitmqworker1.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.KlientJPARepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.mapper.CkkKlienciMapper;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;

@Service
public class KlientService {
	
	@Autowired
	KlientJPARepository klientJPARepository;
	
	public KlientDTO findByKlKod( Long kodCKK ) {
		
		CkkKlienciMapper mapper = Mappers.getMapper(CkkKlienciMapper.class);
        
		KlientDTO klient = mapper.mapToKlientDTO(klientJPARepository.findByKlKod(kodCKK));
		
		return klient;
	}
	
}
