package com.example.demo.controller;

import java.util.Date;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Patients;
import com.example.demo.repository.PatientsRepository;
import com.example.demo.service.PatientsService;

@Controller
@Component
public class PatientsController {
	@Autowired
	PatientsService patientsService;
	@Autowired
	PatientsRepository patientsRepository;
	
	  @RequestMapping("/") 
	  public String Entry() 
	  {
		return patientsService.Entry();
	  
	  }
	 
	@RequestMapping("/loginn")
    public String Login() {
		return patientsService.Login();

        
    }

	
	  @RequestMapping("/pregistration")
	  public String Registration() {
	   return patientsService.Registration();
	 
	  
	  }
	 
		
	

	@PostMapping("/regsuccess")
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
			
			)
	{
		return patientsService.viewDetails(name, password, emailid, dateofbirth, gender, bloodgroup, mobilenumber, address, modelMap);
	}
	

	  @RequestMapping("/plogin")
	  public String PatientHome() {
	   return patientsService.PatientHome();
	  }
	 

	  
	
	
	}

	


