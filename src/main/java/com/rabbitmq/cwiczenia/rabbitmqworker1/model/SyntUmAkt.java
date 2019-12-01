package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

//import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class SyntUmAkt {

	@Getter
	@Setter
	int CZY_AKTUALNY;
	@Getter
	@Setter
	int id;
	@Getter
	@Setter
	int SUA_PART_NUMBER;
	@Getter
	@Setter
	int SUA_KL_KOD;
	@Getter
	@Setter
	String SUA_A_DOK_NUMER;

	public SyntUmAkt(int CZY_AKTUALNY, int SUA_PART_NUMBER, int id, int SUA_KL_KOD, String SUA_A_DOK_NUMER) {
		this.CZY_AKTUALNY = CZY_AKTUALNY;
		this.SUA_PART_NUMBER = SUA_PART_NUMBER;
		this.id = id;
		this.SUA_KL_KOD = SUA_KL_KOD;
		this.SUA_A_DOK_NUMER = SUA_A_DOK_NUMER;
	}

}
