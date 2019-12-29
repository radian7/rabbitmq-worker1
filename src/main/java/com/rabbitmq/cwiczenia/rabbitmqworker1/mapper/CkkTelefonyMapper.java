package com.rabbitmq.cwiczenia.rabbitmqworker1.mapper;

import org.mapstruct.Mapper;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KontaktDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkTelefony;

@Mapper
public interface CkkTelefonyMapper {

	CkkTelefony mapToCkkTelefony(KontaktDTO kontaktDTO);
	KontaktDTO mapToKontaktDTO(CkkTelefony ckkTelefony);
}
