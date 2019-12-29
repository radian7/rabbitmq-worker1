package com.rabbitmq.cwiczenia.rabbitmqworker1.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dao.EgRepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.AurumSntAnlJPAEgRepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository.KlientJPARepository;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.AurumSntAnl;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.SyntUmAkt;

import pl.santanderl.adapter.mq.Header;
import pl.santanderl.adapter.mq.Message;
import pl.santanderl.adapter.mq.Producer;

//@Component
@RestController
@RequestMapping("/api")
public class SendRestContoller {

	//@Autowired
	//private Producent prod;

	@Autowired
	Producer pr;
	
	@Autowired
	DataSource dataSource;

	@Autowired
	EgRepository egRepository;

	@Autowired
	AurumSntAnlJPAEgRepository aurumSntAnlJpaEgRepository;
	
	@Autowired
	KlientJPARepository klientJPARepository;

	private static String readLineByLineJava8(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}
	
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
		
		System.out.println("Send in:" );
		
		message = readLineByLineJava8("mess.txt");
		
		System.out.println("Sending:" + message);
		
		Header header = new Header();
		header.setFlowId("262");
		Message m = new Message(header, message);
		
		pr.generateTask(m);
		//prod.send(message);

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
