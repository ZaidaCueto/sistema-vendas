package com.devsuperior.semanadevsuperior.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.semanadevsuperior.entities.Sale;
import com.devsuperior.semanadevsuperior.services.SaleSevice;
import com.devsuperior.semanadevsuperior.services.SmsService;



//Componente responsável por criar o endpoint entre backend e frontend
@RestController
@RequestMapping(value = "/sales")
public class SaleCOntroller {
	
	@Autowired
	private SaleSevice service;
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam (value="minDate",defaultValue="")String minDate, 
			@RequestParam (value="maxDate",defaultValue="")String maxDate,
			Pageable pageable){
		return service.findSales(minDate, maxDate,pageable);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}
}