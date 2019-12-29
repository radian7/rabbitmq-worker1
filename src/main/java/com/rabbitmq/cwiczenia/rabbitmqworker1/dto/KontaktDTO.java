package com.rabbitmq.cwiczenia.rabbitmqworker1.dto;

import java.math.BigDecimal;
import java.util.Date;


import lombok.Data;

@Data
public class KontaktDTO {

	private long tlId;

	private String tlFAutoryzowany;

	private String tlFDomyslny;

	private BigDecimal tlKod;

	private String tlKomentarz;

	private BigDecimal tlLp;

	private String tlNumer;

	private BigDecimal tlRpkId;

	private String tlTyp;

	
}
