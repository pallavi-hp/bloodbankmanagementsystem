package com.bloodbankapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbankapplication.model.BloodBankDonorDetails;
import com.bloodbankapplication.model.BloodBankRequestorDetails;
import com.bloodbankapplication.service.BloodBankAdminService;
import com.bloodbankapplication.service.BloodBankRegistrationService;
import com.bloodbankapplication.service.BloodBankRoleService;

@Controller
public class BloodBankController {
	@Autowired
	private BloodBankRegistrationService registrationService;
	@Autowired
	private BloodBankRoleService roleService;
	@Autowired
	private BloodBankAdminService adminService;

	@RequestMapping(value = "/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value = "/register")
	public String registerFunction() {
		return "register";
	}
	
	@RequestMapping(value = "/aboutUs")
	public String aboutUsPage() {
		return "aboutUs";
	}

	@RequestMapping(value = "/registrationsubmit")
	public ModelAndView registrationSubmitFunction( @ModelAttribute("donorDetails") @Validated  BloodBankDonorDetails donorDetails,
			@ModelAttribute("requestorDetails") @Validated BloodBankRequestorDetails requestorDetails, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView1 = new ModelAndView("register");
			return modelAndView1;
		}
		else{
			ModelAndView modelAndView = new ModelAndView("succesfull");
		if (donorDetails.getRole().equalsIgnoreCase("donor")) {
			modelAndView.addObject("key", donorDetails);
			registrationService.saveDonor(donorDetails);

		} else {
			modelAndView.addObject("key", requestorDetails);
			registrationService.saveRequestor(requestorDetails);
		}

		return modelAndView;
	}
	}

	@RequestMapping(value = "/role")
	public String signInFunction() {
		return "role";
	}

	@RequestMapping(value = "/roleSubmit")
	public String roleFunction(@RequestParam("role") String role, Model model) {
		int roleValidationResult = roleService.roleFunction(role);
		if (roleValidationResult == 1) {
			return "donor_Login";

		} else {
			return "requestor_Login";
		}
	}

	@RequestMapping(value = "/signIn")
	public String donorSignInFunction(@RequestParam("id") int id, @RequestParam("password") String pwd, Model model) {
		BloodBankDonorDetails donorDetails = new BloodBankDonorDetails();
		donorDetails.setId(id);
		donorDetails.setPassword(pwd);

		BloodBankDonorDetails donor = registrationService.findByIdAndPasswordIn(donorDetails.getId(),
				donorDetails.getPassword());

		if (donor != null) {
			model.addAttribute("key", donor);
			return "donor_Information";
		} else {
			return "invalid";
		}
	}

	@RequestMapping(value = "/requestsignIn")
	public String requestorSignInFunction(@RequestParam("id") int id, @RequestParam("password") String password,
			Model model) {

		BloodBankRequestorDetails requestorDetails = new BloodBankRequestorDetails();

		requestorDetails.setId(id);
		requestorDetails.setPassword(password);

		BloodBankRequestorDetails requestor = registrationService.readByIdAndPasswordIn(requestorDetails.getId(),
				requestorDetails.getPassword());

		if (requestor != null) {
			model.addAttribute("key", requestor);
			return "requestor_Information";
		} else {
			return "invalid";
		}
	}

	@RequestMapping(value = "/details")
	public ModelAndView donorDetailsForRequestorFunction() {
		ModelAndView modelAndView = new ModelAndView("donor_Check_Requestor");
		List<BloodBankDonorDetails> listOfDonors = roleService.donorDetailsForRequestorFunction();
		modelAndView.addObject("donorDetails", listOfDonors);
		return modelAndView;
	}

	@RequestMapping(value = "/admin")
	public String adminLoginFunction() {
		return "admin_Login";
	}

	@RequestMapping(value = "/adminLogin")
	public String adminHomeFunction(@RequestParam("id") int id, @RequestParam("password") String password) {
		int result = adminService.adminValidation(id, password);
		if (result == 1) {
			return "admin_UpdateStatus";
		} else {
			return "invalid";
		}

	}

	@RequestMapping(value = "/UpdateStatus")
	public ModelAndView updateDonorStatusFunction() {
		List<BloodBankDonorDetails> list = adminService.updateDonorStatus();
		List<BloodBankRequestorDetails> list1 = adminService.updateRequestorStatus();
		ModelAndView modelAndView = new ModelAndView("donor_DetailsForAdmin");
		modelAndView.addObject("details", list);
		modelAndView.addObject("key", list1);
		return modelAndView;
	}
	
	 @RequestMapping(value = "/accept") 
	 public String acceptRequestFunction(@RequestParam("id") int id, @RequestParam("role") String role) {
	  adminService.findByIdAndRole(id, role); 
	  return "admin_UpdateStatus"; 
	  }
	 
	  @RequestMapping(value = "/reject") 
	  public String rejectRequestFunction(@RequestParam("id") int id, @RequestParam("role") String role) {
	  adminService.updateByIdAndRole(id, role); 
	  return "admin_UpdateStatus"; 
	  }
	
}
