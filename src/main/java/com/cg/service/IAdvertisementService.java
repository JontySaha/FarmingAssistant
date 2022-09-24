package com.cg.service;

import java.util.List;

import com.cg.entity.Advertisement;
import com.cg.exception.AdvertisementNotFoundException;

public interface IAdvertisementService {
	Advertisement addAdvertisement(Advertisement advt);
	Advertisement updateAdvertisement(int id,Advertisement advt) throws AdvertisementNotFoundException;
	void deleteAdvertisement(int id) throws AdvertisementNotFoundException; 
	List<Advertisement> getAllAdvertisement();
}
