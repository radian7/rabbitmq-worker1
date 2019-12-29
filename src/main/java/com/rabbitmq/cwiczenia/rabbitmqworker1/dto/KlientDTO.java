package com.rabbitmq.cwiczenia.rabbitmqworker1.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkAdresy;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienciDane;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkTelefony;

import lombok.Data;

@Data
public class KlientDTO {

	private long klKod;

	private Date klDataKontaEbok;

	private String klFSynchronized;

	private String klKodObcy;

	private String klSkrot;

	private List<AdresDTO> adresy;

	private List<CkkKlienciDane> klienciDane;

	private List<CkkTelefony> telefony;

	
}
