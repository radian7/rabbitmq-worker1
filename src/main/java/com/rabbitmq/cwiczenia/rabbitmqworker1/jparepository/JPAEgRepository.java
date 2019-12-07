package com.rabbitmq.cwiczenia.rabbitmqworker1.jparepository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.rabbitmq.cwiczenia.rabbitmqworker1.model.AurumSntAnl;

@Transactional(readOnly = true)
public interface JPAEgRepository extends JpaRepository<AurumSntAnl, String> {

	@Query("select p from AurumSntAnl p where p.aDokNumer = ?1")
	AurumSntAnl findByaDokNumer(String aDokNumer);

	@Query("select p from AurumSntAnl p where p.klKod = ?1")
	Iterable<AurumSntAnl> findByklKod(BigDecimal klKod);
}
