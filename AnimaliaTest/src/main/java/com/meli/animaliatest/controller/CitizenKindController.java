package com.meli.animaliatest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.animaliatest.service.CitizenKindService;
import com.meli.animaliatest.model.CitizenKindModel;

@RequestMapping("/CitizenKind")
@RestController
public class CitizenKindController {
	
	@Autowired
	private CitizenKindService service;
	
	@GetMapping("/GetAll")
	public List<CitizenKindModel> GetAll(){
		return service.GetAll();
	}

}
