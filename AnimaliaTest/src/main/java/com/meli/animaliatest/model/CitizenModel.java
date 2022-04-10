package com.meli.animaliatest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Citizen")
public class CitizenModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CitizenId")
	private Integer CitizenId;

	@Column(name="CitizenIdentifier")
	private String CitizenIdentifier;
	
	@Column(name="CitizenName")
	private String CitizenName;
	
	@Column(name="CitizenKindId")
	private Integer CitizenKindId;
	
	@Column(name="CitizenDescription")
	private String CitizenDescription;
	
	@Column(name="CitizenURL")
	private String CitizenURL;
	
	@Column(name="CitizenPet")
	private Boolean CitizenPet;
	
	@Column(name="CitizenDateCreation")
	private String CitizenDateCreation;

	public CitizenModel(Integer citizenId, String citizenIdentifier, String citizenName, Integer citizenKindId,
			String citizenDescription, String citizenURL, Boolean citizenPet, String citizenDateCreation) {
		super();
		CitizenId = citizenId;
		CitizenIdentifier = citizenIdentifier;
		CitizenName = citizenName;
		CitizenKindId = citizenKindId;
		CitizenDescription = citizenDescription;
		CitizenURL = citizenURL;
		CitizenPet = citizenPet;
		CitizenDateCreation = citizenDateCreation;
	}
	
	public CitizenModel(String citizenIdentifier, String citizenName, Integer citizenKindId,
			String citizenDescription, String citizenURL, Boolean citizenPet, String citizenDateCreation) {
		super();
		CitizenIdentifier = citizenIdentifier;
		CitizenName = citizenName;
		CitizenKindId = citizenKindId;
		CitizenDescription = citizenDescription;
		CitizenURL = citizenURL;
		CitizenPet = citizenPet;
		CitizenDateCreation = citizenDateCreation;
	}
	
	public Integer getCitizenId() {
		return CitizenId;
	}

	public void setCitizenId(Integer citizenId) {
		CitizenId = citizenId;
	}

	public String getCitizenIdentifier() {
		return CitizenIdentifier;
	}

	public void setCitizenIdentifier(String citizenIdentifier) {
		CitizenIdentifier = citizenIdentifier;
	}

	public String getCitizenName() {
		return CitizenName;
	}

	public void setCitizenName(String citizenName) {
		CitizenName = citizenName;
	}

	public Integer getCitizenKindId() {
		return CitizenKindId;
	}

	public void setCitizenKindId(Integer citizenKindId) {
		CitizenKindId = citizenKindId;
	}

	public String getCitizenDescription() {
		return CitizenDescription;
	}

	public void setCitizenDescription(String citizenDescription) {
		CitizenDescription = citizenDescription;
	}

	public String getCitizenURL() {
		return CitizenURL;
	}

	public void setCitizenURL(String citizenURL) {
		CitizenURL = citizenURL;
	}

	public Boolean getCitizenPet() {
		return CitizenPet;
	}

	public void setCitizenPet(Boolean citizenPet) {
		CitizenPet = citizenPet;
	}

	public String getCitizenDateCreation() {
		return CitizenDateCreation;
	}

	public void setCitizenDateCreation(String citizenDateCreation) {
		CitizenDateCreation = citizenDateCreation;
	}

	public CitizenModel() {
		super();
	}

}
