package com.devsuperior.semanadevsuperior.services;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.semanadevsuperior.entities.Sale;
import com.devsuperior.semanadevsuperior.repositories.SaleRepository;



//Componente responsável por executar funções no Banco de Dados
@Service
public class SaleSevice {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate before = today.minusDays(365);
		
		LocalDate min = minDate.equals("") ? before : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}
}
