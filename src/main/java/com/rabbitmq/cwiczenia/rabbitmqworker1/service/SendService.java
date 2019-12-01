package com.rabbitmq.cwiczenia.rabbitmqworker1.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.cwiczenia.rabbitmqworker1.Producent;
import com.rabbitmq.cwiczenia.rabbitmqworker1.dao.EgRepository;

@RestController
@RequestMapping("/api")
public class SendService {

	@Autowired
	private Producent prod;

	@Autowired
	DataSource dataSource;

	@Autowired
	EgRepository egRepository;

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

	@RequestMapping("/getSyntUmAkt") // wskazanie pod jakim adresem dostępna jest metoda (EndPoint)
	@ResponseBody // wskazówka dla kontekstu Spring, aby zawartość metody (w tym przypadku String)
					// był zwracany nie do modelu dla widoku lecz jako obiekt
	public String getSyntUmAkt() { // sygnatura metody
		System.out.println(" hello ");
		String out = "";
		/*
		 * List<SyntUmAkt> list = egRepository.findAll(); // list.forEach(x ->
		 * System.out.println(x.getSUA_A_DOK_NUMER()));
		 * 
		 * Iterator iterator = list.iterator(); while (iterator.hasNext()) { out = out +
		 * "; " + ((SyntUmAkt) iterator.next()).getSUA_A_DOK_NUMER(); }
		 */
		out = egRepository.getQuery();
		System.out.println(out);
		return out;
		// return "Hello World! :)"; // zwracana wartość przez przeglądarkę
	}

}
