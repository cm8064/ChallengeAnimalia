package com.meli.animaliatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.animaliatest.service.CitizenService;
import com.meli.animaliatest.model.ResponseBaseModel;
import com.meli.animaliatest.model.ResponseBaseModel2;
import com.meli.animaliatest.model.CitizenModel;

@RequestMapping("/Citizen")
@RestController
public class CitizenController {
	
	@Autowired
	private CitizenService service;
	
	@GetMapping("/GetAll")
	public ResponseBaseModel2 GetAll(){
		return service.GetAll();
	}
	
	@GetMapping("/FindById/{Id}")
	public ResponseBaseModel FindById(@PathVariable Integer Id){
		return service.FindCitizenById(Id);
	}
	
	@PostMapping("/Create")
	public ResponseBaseModel Create(@RequestBody CitizenModel Citizen){
		return service.Create(Citizen);
	}
	
	@PutMapping("/Update")
	public ResponseBaseModel Update(@RequestBody CitizenModel Citizen){
		return service.Update(Citizen);
	}
	
	@DeleteMapping("/Delete/{Id}")
	public ResponseBaseModel DeleteById(@PathVariable Integer Id){
		return service.DeleteCitizenById(Id);
	}
	
}
