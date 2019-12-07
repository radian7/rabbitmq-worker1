package com.rabbitmq.cwiczenia.rabbitmqworker1.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class EgRepository {

	@Autowired
//	private JdbcTemplate jdbcTemplate;

	private final ObjectMapper mapper = new ObjectMapper();

	/*
	 * public List<SyntUmAkt> findAll() {
	 * 
	 * String query =
	 * "SELECT CZY_AKTUALNY, SUA_PART_NUMBER, ID, SUA_KL_KOD, SUA_A_DOK_NUMER FROM ods.V_SYNT_UM_AKT where SUA_KL_KOD = 41787 "
	 * ; // SUA_A_DOK_NUMER = 'ZB3/00098/2005' List<SyntUmAkt> result =
	 * jdbcTemplate.query(query, (rs, rowNum) -> new
	 * SyntUmAkt(rs.getInt("CZY_AKTUALNY"), rs.getInt("SUA_PART_NUMBER"),
	 * rs.getInt("ID"), rs.getInt("SUA_KL_KOD"), rs.getString("SUA_A_DOK_NUMER")));
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * public String getQuery() {
	 * 
	 * List<SyntUmAkt> ls = findAll();
	 * 
	 * // List<Map<String, Object>> ls = jdbcTemplate.queryForList(query);
	 * 
	 * String json = ""; try { json = mapper.writeValueAsString(ls); } catch
	 * (JsonProcessingException e) { e.printStackTrace(); } return json; }
	 */

}
