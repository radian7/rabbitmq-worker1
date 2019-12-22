package com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.rabbitmq.cwiczenia.rabbitmqworker1.model.CkkKlienci;
	
@Repository
@Transactional(readOnly = true)
public interface KlientJPARepository extends JpaRepository<CkkKlienci, String> {

	@Query("select p from CkkKlienci p where p.klKod = ?1")
	CkkKlienci findByKlKod(long klKod);


}
