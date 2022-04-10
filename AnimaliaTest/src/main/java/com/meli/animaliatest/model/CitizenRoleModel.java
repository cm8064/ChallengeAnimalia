package com.meli.animaliatest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CitizenRole")
public class CitizenRoleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CitizenRoleId")
	private Double CitizenRoleId;
	
	@Column(name="CitizenId")
	private Double CitizenId;
	
	@Column(name="RoleId")
	private Double RoleId;
	
	public CitizenRoleModel(Double citizenRoleId, Double citizenId, Double roleId) {
		super();
		CitizenRoleId = citizenRoleId;
		CitizenId = citizenId;
		RoleId = roleId;
	}
	
	public CitizenRoleModel(Double citizenId, Double roleId) {
		super();
		CitizenId = citizenId;
		RoleId = roleId;
	}
	
	public CitizenRoleModel() {
		super();
	}

	public Double getCitizenRoleId() {
		return CitizenRoleId;
	}

	public void setCitizenRoleId(Double citizenRoleId) {
		CitizenRoleId = citizenRoleId;
	}

	public Double getCitizenId() {
		return CitizenId;
	}

	public void setCitizenId(Double citizenId) {
		CitizenId = citizenId;
	}

	public Double getRoleId() {
		return RoleId;
	}

	public void setRoleId(Double roleId) {
		RoleId = roleId;
	}
	
}
