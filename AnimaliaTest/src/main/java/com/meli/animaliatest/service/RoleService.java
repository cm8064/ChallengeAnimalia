package com.meli.animaliatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.animaliatest.model.RoleModel;
import com.meli.animaliatest.repository.IRoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private IRoleRepository RoleRepository;

	public List<RoleModel> GetAll() {
		return RoleRepository.findAll();
	}

}
