package com.bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bloodbankapplication.dao.BloodBankRegistrationDao;
import com.bloodbankapplication.dao.BloodBankRequestorRegistrationDao;
import com.bloodbankapplication.model.BloodBankDonorDetails;
import com.bloodbankapplication.model.BloodBankRequestorDetails;

@Service
public class BloodBankAdminServiceImpl implements BloodBankAdminService {

	@Autowired
	private BloodBankRegistrationDao registrationDao;

	@Autowired
	private BloodBankRequestorRegistrationDao requestorRegistrationDao;

	@Override
	@Transactional
	public int adminValidation(int id, String password) {
		if (id == 12345 && password.equalsIgnoreCase("admin")) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override

	@Transactional
	public List<BloodBankDonorDetails> updateDonorStatus() {
		List<BloodBankDonorDetails> list = registrationDao.findByStatus();
		return list;
	}

	@Override

	@Transactional
	public List<BloodBankRequestorDetails> updateRequestorStatus() {
		List<BloodBankRequestorDetails> list = requestorRegistrationDao.findByStatus();
		return list;
	}

	@Override

	@Transactional
	public void findByIdAndRole(int id, String role) {
		if (role.equalsIgnoreCase("donor")) {
			registrationDao.searchById(id);
		} else {
			requestorRegistrationDao.searchById(id);
		}

	}

	@Override

	@Transactional
	public void updateByIdAndRole(int id, String role) {
		if (role.equalsIgnoreCase("donor")) {
			registrationDao.updateById(id);
		} else {
			requestorRegistrationDao.updateById(id);
		}

	}
}
