package com.devsuperior.semanadevsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.semanadevsuperior.entities.Sale;
import com.devsuperior.semanadevsuperior.services.SaleSevice;

@RestController
@RequestMapping(value = "/sales")
public class SaleCOntroller {
	
	@Autowired
	private SaleSevice service;
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
	}

}
