package com.rabbitmq.cwiczenia.rabbitmqworker1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.AdresDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkAdresy;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;

@Mapper
public interface CkkAdresyMapper {

	//@Mapping(source = "attachmentDTO", target = "attachment")
    
	
	CkkAdresy mapToCkkAdresy(AdresDTO klientDTO);
	AdresDTO mapToAdresDTO(CkkAdresy CkkAdresy);
	
}
