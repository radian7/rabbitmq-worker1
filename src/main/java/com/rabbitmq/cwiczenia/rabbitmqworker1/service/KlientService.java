package com.rabbitmq.cwiczenia.rabbitmqworker1.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.KlientJPARepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.mapper.CkkKlienciMapper;


@Service
public class KlientService {
	
	@Autowired
	KlientJPARepository klientJPARepository;
	
	@Transactional
	public KlientDTO findByKlKod( Long kodCKK ) {
		
		CkkKlienciMapper mapper = Mappers.getMapper(CkkKlienciMapper.class);
        

		
		return mapper.mapToKlientDTO(klientJPARepository.findByKlKod(kodCKK));
	}
	
}
