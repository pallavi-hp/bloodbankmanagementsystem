package com.bloodbankapplication.service;

import java.util.List;

import com.bloodbankapplication.model.BloodBankDonorDetails;


public interface BloodBankRoleService {
	public abstract int roleFunction(String roleEntered);

	public abstract List<BloodBankDonorDetails> donorDetailsForRequestorFunction();

}
