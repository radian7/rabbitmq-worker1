package pl.santanderl.adapter.rpc.rest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;
import com.rabbitmq.cwiczenia.rabbitmqworker1.service.KlientService;

import pl.santanderl.adapter.rpc.Server;

@RestController
@RequestMapping("/ckkq")
public class CKKServerRestQ {

	@Autowired
	KlientService klientService;

	
	@GetMapping("/klient/{kodCKK}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<KlientDTO> getKlient(@PathVariable("kodCKK") Long kodCKK) {
		System.out.println("getKlient");

		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("flow_id", "262");
	 
	    return ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body(klientService.findByKlKod(  kodCKK ));

		//return  klientService.findByKlKod(  kodCKK );
	}
	
}
