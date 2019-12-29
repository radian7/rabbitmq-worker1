package com.rabbitmq.cwiczenia.rabbitmqworker1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;

@Mapper(uses = {CkkAdresyMapper.class})
public interface CkkKlienciMapper {

	@Mapping(source = "ckkAdresies", target = "adresy")
	@Mapping(source = "ckkTelefonies", target = "kontakty")
	
	//CkkKlienci mapToCkkKlienci(KlientDTO klientDTO);
	KlientDTO mapToKlientDTO(CkkKlienci ckkKlienci);
}
