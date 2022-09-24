package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.FarmerLogin;
import com.cg.exception.EmailNotFoundException;
import com.cg.exception.InvalidCredentialsException;
import com.cg.repository.IFarmerLoginRepository;

import dto.FarmerLoginDto;
import dto.FarmerLoginRespDto;

public class FarmerLoginServiceImpl implements IFarmerLoginService {

	@Autowired
	IFarmerLoginRepository farmerLoginRepo;
	
//	@Override
//	public FarmerLogin login(FarmerLogin credentials) {
//		Optional<FarmerLogin> dbLoginCred = farmerLoginRepo.findById(credentials.getEmail());
//
//		if (dbLoginCred.isPresent()) {
//			// compare db password with user provided password
//			// if password matching return credentials else throw exception
//			FarmerLogin farmerLogin = dbLoginCred.get();
//			if (farmerLogin.getPassword().equals(credentials.getPassword())
//					&& farmerLogin.getRole().equals(credentials.getRole())) {
//				farmerLogin.setLoggedIn(true);
//				return farmerLoginRepo.save(farmerLogin);
//				
//			} else {
//				throw new InvalidCredentialsException("Invalid credentials!");
//			}
//		} else {
//			// throw exception if given email not present in the db.
//			throw new InvalidCredentialsException("User not found with email: "+credentials.getEmail());
//		}
//	}

	@Override
	public FarmerLoginRespDto login(FarmerLoginDto farmerLoginDto) {
		
		Optional<FarmerLogin> dbLoginOpt = farmerLoginRepo.findById(farmerLoginDto.getEmail());

		if (dbLoginOpt.isPresent()) {
			// compare db password with user provided password
			// if password matching return credentials else throw exception
			FarmerLogin farmerLogin = dbLoginOpt.get();
			if (farmerLogin.getPassword().equals(farmerLoginDto.getPassword())
					&& farmerLogin.getRole().equals(farmerLoginDto.getRole())) {
				
				// if credentials matches, set loggedIn flag as true and save
				farmerLogin.setLoggedIn(true);
				farmerLoginRepo.save(farmerLogin);
				
				// convert Login to LoginRespDto Obj
				FarmerLoginRespDto resDto = new FarmerLoginRespDto();
				resDto.setEmail(farmerLogin.getEmail());
				resDto.setRole(farmerLogin.getRole());
				resDto.setLoggedIn(farmerLogin.isLoggedIn());
				
				return resDto;
				
			} else {
				throw new InvalidCredentialsException("Invalid credentials!");
			}
		} else {
			// throw exception if given email not present in the db.
			throw new InvalidCredentialsException("User not found with email: "+farmerLoginDto.getEmail());
		}
	}

	@Override
	public FarmerLoginRespDto logout(String email) throws EmailNotFoundException {
		Optional<FarmerLogin> dbLoginOpt = farmerLoginRepo.findById(email);
		if(dbLoginOpt.isPresent()) {
			// update isLoggedIn flag as false and save
			FarmerLogin farmerLogin = dbLoginOpt.get();
			
			// Update flag to false and save
			farmerLogin.setLoggedIn(false);
			farmerLoginRepo.save(farmerLogin);
			
			// Convert Login obj to LoginRespDto
			FarmerLoginRespDto resDto = new FarmerLoginRespDto();
			
			resDto.setLoggedIn(false);
					
			// return LoginRespDto obj
			return resDto;
		} else {
			throw new EmailNotFoundException("User not found with email: "+email);
		}
	}

}
