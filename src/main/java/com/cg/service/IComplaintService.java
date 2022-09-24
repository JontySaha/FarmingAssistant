package com.cg.service;

import java.util.List;

import com.cg.entity.Complaint;

public interface IComplaintService {
	Complaint addComplaint(Complaint comp);
	List<Complaint> getAllComplaint();
}
