package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Admin;
import com.example.demo.repository.AdminRepository;


@Component
@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	public String Login() {
		
		return "AdminLogin";
	}

	public String Registration() {
		
		return "AdminRegistration";
	}

	
	public String viewDetails(
			   @RequestParam("name") String name,
				@RequestParam("password")String password,
				@RequestParam("emailid")  String emailid,
				@RequestParam("gender")  String gender,
			
				@RequestParam("mobilenumber")  long mobilenumber,
				ModelMap modelMap
			
			) {
	
		Admin admin=new Admin();
     
	
		admin.setId(admin.getId());
		admin.setName(name);
		admin.setPassword(password);
		admin.setEmailid(emailid);
		admin.setGender(gender);
	
		admin.setMobilenumber(mobilenumber);
     
		this.adminRepository.save(admin);
		

  	modelMap.put("id", admin.getId());
	modelMap.put("name",name);
	modelMap.put("password", password);
	modelMap.put("emailid", emailid);
	modelMap.put("gender", gender);
	
	modelMap.put("mobilenumber", mobilenumber);
	return "Adminregistsuccess";
	
	
	
	
	}
	
	public String AdminHome() {
		
		return "AdminHome";
	}

}
