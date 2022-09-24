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
public class Advertisement {
	@Id
	@GeneratedValue
	private int id;
	
//	@Column(name = "cropType",nullable=false)
	private String cropType;
	
//	@Column(name = "quantity",nullable=false)
	private int quantity;

//	@Column(name = "weight",nullable=false)
	private String weight;
	
//	@Column(name = "price",nullable=false)
	private String price;

	private boolean status=false;
}
