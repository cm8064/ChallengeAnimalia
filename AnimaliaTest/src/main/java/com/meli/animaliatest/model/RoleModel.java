package com.meli.animaliatest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class RoleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RoleId")
	private Integer RoleId;
	
	@Column(name="RoleName")
	private String RoleName;
	
	@Column(name="RoleDescription")
	private String RoleDescription;

	public RoleModel(Integer roleId, String roleName, String roleDescription) {
		super();
		RoleId = roleId;
		RoleName = roleName;
		RoleDescription = roleDescription;
	}
	
	public RoleModel(String roleName, String roleDescription) {
		super();
		RoleName = roleName;
		RoleDescription = roleDescription;
	}
	
	public RoleModel() {
		super();
	}

	public Integer getRoleId() {
		return RoleId;
	}

	public void setRoleId(Integer roleId) {
		RoleId = roleId;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public String getRoleDescription() {
		return RoleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}
}
