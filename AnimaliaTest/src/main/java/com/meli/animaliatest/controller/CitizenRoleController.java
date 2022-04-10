package com.meli.animaliatest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.animaliatest.model.CitizenRoleModel;
import com.meli.animaliatest.service.CitizenRoleService;

@RequestMapping("/CitizenRole")
@RestController
public class CitizenRoleController {
	
	@Autowired
	private CitizenRoleService service;
	
	@GetMapping("/GetAll")
	public List<CitizenRoleModel> GetAll(){
		return service.GetAll();
	}

}
