package com.meli.animaliatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.animaliatest.model.CitizenRoleModel;
import com.meli.animaliatest.repository.ICitizenRoleRepository;

@Service
public class CitizenRoleService {
	
	@Autowired
	private ICitizenRoleRepository CitizenRoleRepository;

	public List<CitizenRoleModel> GetAll() {
		return CitizenRoleRepository.findAll();
	}

}
