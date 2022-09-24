package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.Complaint;
import com.cg.repository.IComplaintRepository;

public class ComplaintServiceImpl implements IComplaintService {

	@Autowired
	IComplaintRepository compRepo;
	
	@Override
	public Complaint addComplaint(Complaint comp) {
		return compRepo.save(comp);
	}

	@Override
	public List<Complaint> getAllComplaint() {
		List<Complaint> complaints = compRepo.findAll();
		return complaints;
	}

}
