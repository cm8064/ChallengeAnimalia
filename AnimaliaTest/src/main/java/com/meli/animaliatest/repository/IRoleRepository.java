package com.meli.animaliatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.animaliatest.model.RoleModel;

public interface IRoleRepository extends JpaRepository<RoleModel, Integer>  {

}
