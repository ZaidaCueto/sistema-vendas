package com.devsuperior.semanadevsuperior.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.semanadevsuperior.entities.Sale;
import com.devsuperior.semanadevsuperior.repositories.SaleRepository;

@Service
public class SaleSevice {
	
	@Autowired
	private  SaleRepository repository;
	public List<Sale> findSales() {
return repository.findAll();
	}
}
