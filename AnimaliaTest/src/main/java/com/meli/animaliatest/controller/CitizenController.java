package com.meli.animaliatest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.animaliatest.service.CitizenService;
import com.meli.animaliatest.model.CitizenModel;

@RequestMapping("/Citizen")
@RestController
public class CitizenController {
	
	@Autowired
	private CitizenService service;
	
	@GetMapping("/GetAll")
	public List<CitizenModel> GetAll(){
		return service.GetAll();
	}
	
}
