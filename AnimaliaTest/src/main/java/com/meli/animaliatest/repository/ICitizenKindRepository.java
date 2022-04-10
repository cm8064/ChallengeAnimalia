package com.meli.animaliatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.animaliatest.model.CitizenKindModel;

public interface ICitizenKindRepository extends JpaRepository<CitizenKindModel, Double> {

}
