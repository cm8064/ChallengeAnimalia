package com.meli.animaliatest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CitizenKind")
public class CitizenKindModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CitizenKindId")
	private Double CitizenKindId;
	
	@Column(name="CitizenKindSpeciesName")
	private String CitizenKindSpeciesName;
	
	@Column(name="CitizenKindWeight")
	private String CitizenKindWeight;
	
	@Column(name="CitizenKindHeight")
	private String CitizenKindHeight;
	
	@Column(name="CitizenKindDateCreation")
	private String CitizenKindDateCreation;

	public CitizenKindModel(Double citizenKindId, String citizenKindSpeciesName, String citizenKindWeight,
			String citizenKindHeight, String citizenKindDateCreation) {
		super();
		CitizenKindId = citizenKindId;
		CitizenKindSpeciesName = citizenKindSpeciesName;
		CitizenKindWeight = citizenKindWeight;
		CitizenKindHeight = citizenKindHeight;
		CitizenKindDateCreation = citizenKindDateCreation;
	}
	
	public CitizenKindModel(String citizenKindSpeciesName, String citizenKindWeight,
			String citizenKindHeight, String citizenKindDateCreation) {
		super();
		CitizenKindSpeciesName = citizenKindSpeciesName;
		CitizenKindWeight = citizenKindWeight;
		CitizenKindHeight = citizenKindHeight;
		CitizenKindDateCreation = citizenKindDateCreation;
	}
	
	public CitizenKindModel() {
		super();
	}

	public Double getCitizenKindId() {
		return CitizenKindId;
	}

	public void setCitizenKindId(Double citizenKindId) {
		CitizenKindId = citizenKindId;
	}

	public String getCitizenKindSpeciesName() {
		return CitizenKindSpeciesName;
	}

	public void setCitizenKindSpeciesName(String citizenKindSpeciesName) {
		CitizenKindSpeciesName = citizenKindSpeciesName;
	}

	public String getCitizenKindWeight() {
		return CitizenKindWeight;
	}

	public void setCitizenKindWeight(String citizenKindWeight) {
		CitizenKindWeight = citizenKindWeight;
	}

	public String getCitizenKindHeight() {
		return CitizenKindHeight;
	}

	public void setCitizenKindHeight(String citizenKindHeight) {
		CitizenKindHeight = citizenKindHeight;
	}

	public String getCitizenKindDateCreation() {
		return CitizenKindDateCreation;
	}

	public void setCitizenKindDateCreation(String citizenKindDateCreation) {
		CitizenKindDateCreation = citizenKindDateCreation;
	}

}
