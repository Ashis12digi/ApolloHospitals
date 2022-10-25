package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientsRepository;


@Component
@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	PatientsRepository patientsRepository;
	@Autowired
	DoctorRepository doctorRepository;

	public String Login() {
		
		return "AdminLogin";
	}

	public String Registration() {
		
		return "AdminRegistration";
	}

	
	public String viewDetails(
			   @RequestParam("name") String name,
			   @RequestParam("username") String username,
				@RequestParam("password")String password,
				@RequestParam("emailid")  String emailid,
				@RequestParam("gender")  String gender,
			
				@RequestParam("mobilenumber")  long mobilenumber,
				ModelMap modelMap
			
			) {
	
		Admin admin=new Admin();
     
	//admin.setAdminid(admin.getAdminid());
		admin.setId(admin.getId());
		admin.setName(name);
		admin.setUsername(username);
		admin.setPassword(password);
		admin.setEmailid(emailid);
		admin.setGender(gender);
	
		admin.setMobilenumber(mobilenumber);
     
		this.adminRepository.save(admin);
		
 //  modelMap.put("adminid", admin.getAdminid() );
  	modelMap.put("id", admin.getId());
	modelMap.put("name",name);
	modelMap.put("username", username);
	modelMap.put("password", password);
	modelMap.put("emailid", emailid);
	modelMap.put("gender", gender);
	
	modelMap.put("mobilenumber", mobilenumber);
	return "Adminregistsuccess";
	
	
	
	
	}
	
	public String AdminHome() {
		
		return "AdminHome";
	}

	
	
	public List<Patients> allPatients() {
		List<Patients>patient=new ArrayList<>();
		patientsRepository.findAll().forEach(i->patient.add(i));
		
		return patient;
	}

	public List<Doctor> allDoctor() {
		List<Doctor>doctor=new ArrayList<>();
		doctorRepository.findAll().forEach(i->doctor.add(i));
		
		return doctor;
	}

	public Admin getlogin(String username, String password) {
		Admin admin=adminRepository.findByUsernameAndPassword(username,password);
		return admin;
	}

	
	public String ContactUs() {
		return "ContactUs";
	}

}
