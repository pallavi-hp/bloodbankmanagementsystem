package com.bloodbankapplication.service;

import java.util.List;

import com.bloodbankapplication.model.BloodBankDonorDetails;
import com.bloodbankapplication.model.BloodBankRequestorDetails;

public interface BloodBankAdminService {
	public abstract int adminValidation(int id, String password);

	public abstract List<BloodBankDonorDetails> updateDonorStatus();
	
	public abstract List<BloodBankRequestorDetails> updateRequestorStatus();
	
	public abstract void findByIdAndRole(int id, String role);
	
	public abstract void updateByIdAndRole(int id, String role);
	
}
