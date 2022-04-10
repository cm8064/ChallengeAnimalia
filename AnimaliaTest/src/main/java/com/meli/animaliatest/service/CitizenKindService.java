package com.meli.animaliatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.animaliatest.model.CitizenKindModel;
import com.meli.animaliatest.repository.ICitizenKindRepository;


@Service
public class CitizenKindService {
	
	@Autowired
	private ICitizenKindRepository CitizenKindRepository;

	public List<CitizenKindModel> GetAll() {
		return CitizenKindRepository.findAll();
	}

}
