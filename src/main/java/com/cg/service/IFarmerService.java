package com.cg.service;

import com.cg.entity.Farmer;

public interface IFarmerService {
	Farmer addFarmer(Farmer farmer);
	Farmer updateFarmer(int id,Farmer farmer);
	void deleteFarmer(int id);
}
