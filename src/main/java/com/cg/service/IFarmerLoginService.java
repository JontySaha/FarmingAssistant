package com.cg.service;

import com.cg.entity.FarmerLogin;
import com.cg.exception.EmailNotFoundException;

import dto.FarmerLoginDto;
import dto.FarmerLoginRespDto;

public interface IFarmerLoginService {

	//FarmerLogin login(FarmerLogin credentials);

	FarmerLoginRespDto login(FarmerLoginDto farmerLoginDto);

	FarmerLoginRespDto logout(String email) throws EmailNotFoundException;

}
