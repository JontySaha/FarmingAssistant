package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Farmer {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name",nullable=false)
	private String name;

	@Column(name = "password",nullable=false)
	private String password;
	
	@Column(name = "address",nullable=false)
	private String address;
	
	@Column(name = "phoneNo",nullable=false)
	private String phoneNo;
}
