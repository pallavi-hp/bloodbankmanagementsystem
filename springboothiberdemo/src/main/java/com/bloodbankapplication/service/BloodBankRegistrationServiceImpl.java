package com.bloodbankapplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.BloodBankRegistrationDao;
import com.bloodbankapplication.dao.BloodBankRequestorRegistrationDao;

import com.bloodbankapplication.model.BloodBankDonorDetails;
import com.bloodbankapplication.model.BloodBankRequestorDetails;

@Service
public class BloodBankRegistrationServiceImpl implements BloodBankRegistrationService {
	@Autowired
	private BloodBankRegistrationDao registrationDao;
	@Autowired
	private BloodBankRequestorRegistrationDao requestorRegistrationDao;
	private int s = 0;
	private BloodBankDonorDetails donor = null;
	private BloodBankRequestorDetails requestor = null;
	

	@Override
	public BloodBankDonorDetails saveDonor(BloodBankDonorDetails donorDetails) {
		return registrationDao.save(donorDetails);
	}

	@Override
	public BloodBankRequestorDetails saveRequestor(BloodBankRequestorDetails requestorDetails) {
		return requestorRegistrationDao.save(requestorDetails);
	}

@Override
@Transactional
public BloodBankDonorDetails findByIdAndPasswordIn(int id, String password) {
	BloodBankDonorDetails donorDetails = registrationDao.findByIdAndPasswordIn(id, password);
	try {
		if (donorDetails.getId() != 0) {

			if (donorDetails.getId() == id && donorDetails.getPassword().equalsIgnoreCase(password)) {
				s = 1;
			} else {
				s = 0;
			}

		} else {
			s = 0;
		}
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (s == 1) {
		return donorDetails;
	} else {
		return donor;
	}
}

@Override
@Transactional
public BloodBankRequestorDetails readByIdAndPasswordIn(int id, String password) {
	BloodBankRequestorDetails requestorDetails = requestorRegistrationDao.findByIdAndPasswordIn(id, password);
	try {
		if (requestorDetails.getId() != 0) {

			if (requestorDetails.getId() == id && requestorDetails.getPassword().equalsIgnoreCase(password)) {
				s = 1;
			} else {
				s = 0;
			}

		} else {
			s = 0;
		}
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (s == 1) {
		return requestorDetails;
	} else {
		return requestor;
	}
}
}