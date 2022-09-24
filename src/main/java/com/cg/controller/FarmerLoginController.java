package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.EmailNotFoundException;
import com.cg.service.IFarmerLoginService;

import dto.FarmerLoginDto;
import dto.FarmerLoginRespDto;

@RestController
//@RequestMapping("/")
public class FarmerLoginController {
	
	@Autowired
	IFarmerLoginService farmerLoginService;
	
//	@PostMapping("/login")
//	ResponseEntity<Login> login(@RequestBody Login credentials) {
//		Login login= loginServ.login(credentials);
//		return new ResponseEntity<>(login, HttpStatus.OK);
//	}
	
	@PostMapping("/login/dto")
	ResponseEntity<FarmerLoginRespDto> login(@RequestBody FarmerLoginDto farmerLoginDto) {
		FarmerLoginRespDto login= farmerLoginService.login(farmerLoginDto);
		return new ResponseEntity<>(login, HttpStatus.OK);
	}
	
	@PatchMapping("/logout/{email}")
	ResponseEntity<FarmerLoginRespDto> logout(@PathVariable String email) throws EmailNotFoundException {
		FarmerLoginRespDto resp = farmerLoginService.logout(email);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
}
