package com.rabbitmq.cwiczenia.rabbitmqworker1.dto;

import java.math.BigDecimal;



import lombok.Data;

@Data
public class AdresDTO {

	private long adrId;

	private String adrAdresat;

	private String adrFAktualne;

	private BigDecimal adrKod;

	private String adrKodPocztowy;

	private String adrKomentarz;

	private BigDecimal adrKrId;

	private BigDecimal adrLp;

	private String adrMiejscowosc;

	private String adrNumerDomu;

	private String adrNumerLokalu;

	private String adrPoczta;

	private String adrPowiat;

	private String adrTyp;

	private String adrTypUlicy;

	private String adrUlica;

	private BigDecimal adrWojId;

	private String adrZatwierdzony;

	
}
