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

	AdminRepository adminRepository;
	PatientsRepository patientsRepository;
	DoctorRepository doctorRepository;
	
	public AdminService(AdminRepository adminRepository, PatientsRepository patientsRepository,
			DoctorRepository doctorRepository) {
		this.adminRepository = adminRepository;
		this.patientsRepository = patientsRepository;
		this.doctorRepository = doctorRepository;
	}

	public String login() {
		return "adminLogin";
	}

	public String registration() {
		return "adminRegistration";
	}

	public String viewDetails(String adminName,String userName,String password, String emailId, String gender, long mobileNumber,
				ModelMap modelMap) {
	
		Admin admin=new Admin();
		admin.setId(admin.getId());
		admin.setAdminName(adminName);
		admin.setUserName(userName);
		admin.setPassword(password);
		admin.setEmailId(emailId);
		admin.setGender(gender);
		admin.setMobileNumber(mobileNumber);
		this.adminRepository.save(admin);
		
  	modelMap.put("id", admin.getId());
	modelMap.put("adminName",adminName);
	modelMap.put("userName", userName);
	modelMap.put("password", password);
	modelMap.put("emailId", emailId);
	modelMap.put("gender", gender);
	modelMap.put("mobileNumber", mobileNumber);
	return "adminRegistrationSuccessful";
	}
	
	public String adminHome() {
		return "adminHome";
	}
	
	public List<Doctor> allDoctor() {
		List<Doctor>doctor=new ArrayList<>();
		doctorRepository.findAll().forEach(i->doctor.add(i));
		return doctor;
	}

	public Admin getLogin(String userName, String password) {
		Admin admin=adminRepository.findByUserNameAndPassword(userName,password);
		return admin;
	}

	
	public String contactUs() {
		return "contactUs";
	}
	


}
