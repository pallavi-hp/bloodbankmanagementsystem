package com.bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.BloodBankRegistrationDao;
import com.bloodbankapplication.model.BloodBankDonorDetails;

@Service
public class BloodBankRoleServiceImpl implements BloodBankRoleService {

	private String role = "donor";

	@Autowired
	private BloodBankRegistrationDao registrationDao;

	@Override

	public int roleFunction(String roleEntered) {
		if (role.equalsIgnoreCase(roleEntered)) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public List<BloodBankDonorDetails> donorDetailsForRequestorFunction() {
		List<BloodBankDonorDetails> listOfDonors = registrationDao.readByStatus();
		return listOfDonors;
	}
}
