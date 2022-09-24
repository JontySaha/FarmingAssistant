package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Advertisement;
import com.cg.service.IAdvertisementService;


@RestController
@RequestMapping("/advt")
public class AdvertisementController {
	
	@Autowired 
	IAdvertisementService advService;
	

	@GetMapping("/test")
	ResponseEntity<List<Advertisement>> getAllAdvertisement() {
		List<Advertisement> advertisements= advService.getAllAdvertisement();
		return new ResponseEntity<>(advertisements, HttpStatus.OK); // 200 ok
	}
	
	@PostMapping("/adv/add")
	ResponseEntity<Advertisement> addAdvertisement(@RequestBody Advertisement advt) {
		Advertisement newAdvt = advService.addAdvertisement(advt);
		return new ResponseEntity<>(newAdvt, HttpStatus.CREATED); // 201 created 
	}
}
