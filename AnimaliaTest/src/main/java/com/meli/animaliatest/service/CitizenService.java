package com.meli.animaliatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.animaliatest.model.CitizenModel;
import com.meli.animaliatest.repository.ICitizenRepository;

@Service
public class CitizenService {

	@Autowired
	private ICitizenRepository CitizenRepository;

	public List<CitizenModel> GetAll() {
		return CitizenRepository.findAll();
	}

	public void CreateCitizen(CitizenModel citizen) {
		CitizenRepository.save(citizen);
	}

	public CitizenModel GetCitizenById(Integer CitizenId) {
		try {
			return CitizenRepository.findById(CitizenId).get();
		} catch (Exception ex) {
			CitizenModel aldeano = new CitizenModel();
			aldeano.setCitizenName("pollito");
			return aldeano;
		}

	}

	public void DeleteCitizenById(Integer CitizenId) {
		CitizenRepository.deleteById(CitizenId);
	}

}
