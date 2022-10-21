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
	
	
	
	public PatientsController(PatientsRepository patientsRepository,PatientsService patientsService) {
		this.patientsRepository = patientsRepository;
		this.patientsService = patientsService;
	}
	
	
	

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
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			@RequestParam("emailid")  String emailid,
			//@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date dateofbirth,
	//	@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date dateofbirth,
			@RequestParam("Date") Date dateofbirth,
			@RequestParam("gender")  String gender,
			@RequestParam("bloodgroup")  String bloodgroup,
			@RequestParam("mobilenumber")  long mobilenumber,
			@RequestParam("address")  String address,
			
			ModelMap modelMap)
		
		
	{
		return patientsService.viewDetails(name, username, password, emailid, dateofbirth, gender, bloodgroup, mobilenumber, address, modelMap);
	}
	

	/*
	 * @RequestMapping("/plogin") public String PatientHome() { return
	 * patientsService.PatientHome(); }
	 */ 

	
	 @PostMapping("/plogin")
//@RequestMapping(value="/plogin", method= RequestMethod.POST)
		public String PatientHome(@RequestParam("username") String name, @RequestParam("password") String password,
				ModelMap modelMap) {
       Patients patients= new Patients();
	
       patients.setName(name);
       patients.setPassword(password);
			
			modelMap.put("username", name);
			modelMap.put("password", password);


			
		//	patients=patientsRepository.findPatientsByNameAndPassword(name).get(1);
			
			if(patients.getName().equals(password)) {
		
				 return "patientHome";
						  
			} else {
				return "loginerror";
			}
	  
	  }
	
	}

	


