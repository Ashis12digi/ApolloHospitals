package com.example.demo.service;

import java.util.Date;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.PatientsController;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.PatientsRepository;
@Component
@Service
public class PatientsService {
	@Autowired
	PatientsRepository patientsRepository;

	public String Entry() {
		return "index";
	}

	public String Login() {
		return "PatientsLogin";
	}

	public String Registration() {
		return "PatientsRegistration";
	}

	public String viewDetails(
			@RequestParam("name") String name,
			
			@RequestParam("password")String password,
			@RequestParam("emailid")  String emailid,
			@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date dateofbirth,
		
			@RequestParam("gender")  String gender,
			@RequestParam("bloodgroup")  String bloodgroup,
			@RequestParam("mobilenumber")  long mobilenumber,
			@RequestParam("address")  String address,
			
			
			ModelMap modelMap
			
			
			
			) {
		
		Patients patients=new Patients();
		patients.setId(patients.getId());
		patients.setName(name);
		patients.setPassword(password);
		patients.setEmailid(emailid);
		patients.setDateofbirth(dateofbirth);
		patients.setGender(gender);
		patients.setBloodgroup(bloodgroup);
		patients.setMobilenumber(mobilenumber);
	
		patients.setAddress(address);
		
		this.patientsRepository.save(patients);
		

  	modelMap.put("id", patients.getId());
	modelMap.put("name",name);
	modelMap.put("password", password);
	modelMap.put("emailid", emailid);
	modelMap.put("dateofbirth", dateofbirth);
	modelMap.put("gender", gender);
	modelMap.put("bloodgroup", bloodgroup);
	modelMap.put("mobilenumber", mobilenumber);
	modelMap.put("address", address);
	
	return "Reg_Success";
	
	
	}

	public String PatientHome() {
		
		return "patientHome";
	}

	
 
	

}
