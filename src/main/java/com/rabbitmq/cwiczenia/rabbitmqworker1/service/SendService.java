package com.rabbitmq.cwiczenia.rabbitmqworker1.service;

import java.math.BigDecimal;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.cwiczenia.rabbitmqworker1.Producent;
import com.rabbitmq.cwiczenia.rabbitmqworker1.dao.EgRepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.AurumSntAnlJPAEgRepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.KlientJPARepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.AurumSntAnl;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.SyntUmAkt;

@RestController
@RequestMapping("/api")
public class SendService {

	@Autowired
	private Producent prod;

	@Autowired
	DataSource dataSource;

	@Autowired
	EgRepository egRepository;

	@Autowired
	AurumSntAnlJPAEgRepository aurumSntAnlJpaEgRepository;
	
	@Autowired
	KlientJPARepository klientJPARepository;

	@RequestMapping("/hello") // wskazanie pod jakim adresem dostępna jest metoda (EndPoint)
	@ResponseBody // wskazówka dla kontekstu Spring, aby zawartość metody (w tym przypadku String)
					// był zwracany nie do modelu dla widoku lecz jako obiekt
	public String hello() { // sygnatura metody
		System.out.println(" hello ");
		return "Hello World! :)"; // zwracana wartość przez przeglądarkę
	}

	// http://localhost:8081/api/send/test111
	@RequestMapping("/send/{mess}")
	@ResponseBody
	public String send(@PathVariable("mess") String message) {
		// Producent prod = new Producent();
		System.out.println("Sending:" + message);
		prod.send(message);

		return "Success";
	}

	@GetMapping("/getSyntUmAkt") // wskazanie pod jakim adresem dostępna jest metoda (EndPoint)
	@ResponseBody // wskazówka dla kontekstu Spring, aby zawartość metody (w tym przypadku String)
	// był zwracany nie do modelu dla widoku lecz jako obiekt
	public List<SyntUmAkt> getSyntUmAkt() { // sygnatura metody
		// System.out.println(" hello ");
		// String out = "";

		// out = egRepository.getQuery();
		// System.out.println(out);
		return egRepository.findAll();
		// return "Hello World! :)";
		// zwracana wartość przez przeglądarkę
	}

	// @RequestMapping("/getAurumSntAnl")
	@GetMapping("/getAurumSntAnl")
	@ResponseStatus(HttpStatus.OK)
	public List<AurumSntAnl> getAurumSntAnl() {
		System.out.println("getAurumSntAnl");
		/*
		 * List<SyntUmAkt> ls = findAll();
		 * 
		 * // List<Map<String, Object>> ls = jdbcTemplate.queryForList(query);
		 * 
		 * String json = ""; try { json = mapper.writeValueAsString(ls); } catch
		 * (JsonProcessingException e) { e.printStackTrace(); } return json; }
		 */
		return aurumSntAnlJpaEgRepository.findByklKod(new BigDecimal("41787"));
	}

	@GetMapping("/getKlient/{kodCKK}")
	@ResponseStatus(HttpStatus.OK)
	public CkkKlienci getKlient(@PathVariable("kodCKK") Long kodCKK) {
		System.out.println("getKlienci");


		return klientJPARepository.findByKlKod(kodCKK);
	}
	
	
}
