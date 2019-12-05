package com.bloodbankapplication.service;

import com.bloodbankapplication.model.BloodBankDonorDetails;
import com.bloodbankapplication.model.BloodBankRequestorDetails;

public interface BloodBankRegistrationService {

	public abstract BloodBankDonorDetails saveDonor(BloodBankDonorDetails donorDetails);

	public abstract BloodBankRequestorDetails saveRequestor(BloodBankRequestorDetails requestorDetails);

	public abstract BloodBankDonorDetails findByIdAndPasswordIn(int id, String password);
	
	public abstract BloodBankRequestorDetails readByIdAndPasswordIn(int id, String password);
}
