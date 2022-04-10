package com.meli.animaliatest.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.meli.animaliatest.model.CitizenModel;
import com.meli.animaliatest.model.ResponseBaseModel;
import com.meli.animaliatest.model.ResponseBaseModel2;
import com.meli.animaliatest.repository.ICitizenRepository;

@Service
public class CitizenService {

	@Autowired
	private ICitizenRepository CitizenRepository;

	ResponseBaseModel Rpta = new ResponseBaseModel();
	ResponseBaseModel2 Rpta2 = new ResponseBaseModel2();

	// List All Citizen
	public ResponseBaseModel2 GetAll() {
		CleanRpta();

		try {
			Rpta2.Code = 200;
			Rpta2.Message = "List Citizens";
			Rpta2.Object = StreamSupport.stream(CitizenRepository.findAll().spliterator(), false)
					.collect(Collectors.toList());
			Rpta2.Status = "ok";
		} catch (Exception Ex) {
			Rpta2.Code = 500;
			Rpta2.Message = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
			Rpta2.Status = "ex";
		}

		return Rpta2;
	}

	// Search Citizen by Id
	@Nullable
	public ResponseBaseModel FindCitizenById(Integer CitizenId) {
		CleanRpta();

		try {
			Rpta.Code = 200;
			CitizenModel CitizenSearch = CitizenRepository.findById(CitizenId).get();

			if (CitizenSearch != null) {
				Rpta.Message = "Citizen encontrado!";
				Rpta.Object = CitizenSearch;
			} else {
				Rpta.Message = "Citizen -NO- encontrado!";
			}

			Rpta.Status = "ok";
		} catch (Exception Ex) {
			Rpta.Code = 500;
			Rpta.Message = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
			Rpta.Status = "ex";
		}

		return Rpta;
	}

	// Create Citizen
	public ResponseBaseModel Create(CitizenModel citizen) {

		CleanRpta();

		try {
			Rpta.Code = 200;
			Rpta.Message = "Citizen creado exitosamente!";
			CitizenRepository.save(citizen);
			Rpta.Status = "ok";
		} catch (Exception Ex) {
			Rpta.Code = 500;
			Rpta.Message = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
			Rpta.Status = "ex";
		}

		return Rpta;
	}

	// Update Citizen
	public ResponseBaseModel Update(CitizenModel citizen) {

		CleanRpta();

		try {
			Rpta.Code = 200;
			Optional<CitizenModel> CitizenSearch = CitizenRepository.findById(citizen.getCitizenId());
			if(CitizenSearch.isPresent())
			{
				CitizenRepository.save(citizen);
				Rpta.Message = "Citizen actualizado exitosamente!";
			}
			else
			{
				Rpta.Message = "Citizen no encontrado";
			}
			Rpta.Status = "ok";
		} catch (Exception Ex) {
			Rpta.Code = 500;
			Rpta.Message = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
			Rpta.Status = "ex";
		}

		return Rpta;
	}

	// Delete Citizen by Id
	public ResponseBaseModel DeleteCitizenById(Integer CitizenId) {

		CleanRpta();

		try {
			Rpta.Code = 200;
			Rpta.Message = "Citizen borrado exitosamente!";
			CitizenRepository.deleteById(CitizenId);
			Rpta.Status = "ok";
		} catch (Exception Ex) {
			Rpta.Code = 500;
			Rpta.Message = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
			Rpta.Status = "ex";
		}

		return Rpta;
	}

	private void CleanRpta() {
		try {
			Rpta.Code = 0;
			Rpta.Message = "";
			Rpta.Status = "";
			Rpta.Object = null;

			Rpta2.Code = 0;
			Rpta2.Message = "";
			Rpta2.Status = "";
			Rpta2.Object = null;
		} catch (Exception Ex) {
			String msj = Ex.getMessage() + " " + Ex.getCause() + " " + Ex.getStackTrace();
		}

	}
}
