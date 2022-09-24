package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Data;

@Entity
@Data
public class FarmerLogin {

	@Id
	@Email(message="Enter valid email address")
	private String email;
	private String password;
	private String role = "farmer";
	private boolean isLoggedIn = false;
}