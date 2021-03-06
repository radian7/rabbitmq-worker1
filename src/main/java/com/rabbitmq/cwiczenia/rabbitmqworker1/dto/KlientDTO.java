package com.rabbitmq.cwiczenia.rabbitmqworker1.dto;


import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

@Data
public class KlientDTO {

	@JsonProperty("kodCkk")
	private long klKod;

	private Date klDataKontaEbok;

	private String klFSynchronized;

	private String klKodObcy;

	private String klSkrot;

	private List<AdresDTO> adresy;

	private List<KlientDaneDTO> klienciDane;

	private List<KontaktDTO> kontakty;

	
}
