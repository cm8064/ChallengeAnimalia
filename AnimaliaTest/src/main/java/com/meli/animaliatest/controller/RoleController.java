package com.meli.animaliatest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meli.animaliatest.model.RoleModel;
import com.meli.animaliatest.service.RoleService;


@RequestMapping("/Role")
@RestController
public class RoleController {
	
	@Autowired
	private RoleService service;
	
	@GetMapping("/GetAll")
	public List<RoleModel> GetAll(){
		return service.GetAll();
	}

}
