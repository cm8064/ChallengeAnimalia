package com.meli.animaliatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.animaliatest.model.CitizenModel;

public interface ICitizenRepository extends JpaRepository<CitizenModel, Integer> {

}
