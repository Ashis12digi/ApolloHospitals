package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.util.Date;


import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Patients;
import com.example.demo.pojo.Prescription;
import com.example.demo.pojo.Services;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientsRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientsService;
import com.example.demo.service.PrescriptionService;

@Controller
@Component
public class PatientsController {
	@Autowired
	PatientsService patientsService;

	@Autowired
	DoctorService doctorService;
	//@Autowired
//	DoctorRepository doctorRepository;
	
	Patients patients123;
	Appointment appointment123;

	
	

	
	

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
			@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date dateofbirth,
	//	@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date dateofbirth,

			//@RequestParam @DateTimeFormat(pattern=" MM/dd/yyyy ")  Date dateofbirth,
			
		//	@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy ")  Date dateofbirth,
		//	@RequestParam("Date") Date dateofbirth,
			@RequestParam("gender")  String gender,
			@RequestParam("bloodgroup")  String bloodgroup,
			@RequestParam("mobilenumber")  long mobilenumber,
			@RequestParam("address")  String address,
			
			ModelMap modelMap)
		
		
	{
		return patientsService.viewDetails(name, username, password, emailid, dateofbirth, gender, bloodgroup, mobilenumber, address, modelMap);
	}
	
	 
	    @PostMapping("/patientloginusername")
	    public String getpatientlogin(@ModelAttribute("patients") Patients patients, HttpServletRequest request) {
	    	Patients patient1=patientsService.getpatientlogin(patients.getUsername(),patients.getPassword());
	    	if(Objects.nonNull(patient1)) {
	    		
	    		patients123 =patientsService.getdata(request.getParameter("username"));
	    	
	    		return "patientHome";
	    	}
	    	else {
	    		return "adminloginerror";
	    	}
	    	
	    	
	    }
    	
	    @RequestMapping("alllogin") 
		  public String AllLogin() 
		  {
			return patientsService.AllLogin();
		  
		  }
    
	    @GetMapping("/fetchpatient")
		  public String Patient(ModelMap model) {
			
			
			return patientsService.Patient(model);
			  
		  }
	
	    
	    @GetMapping("/patientprofile")
	    public String profile(ModelMap map) {
	       
	        map.put("result", patients123);
	       
	        return "Patientprofile";
	  	    }
	    
	    //fetching service details 
		
		/*
		 * @GetMapping("/patientservice") public String profileService(ModelMap map) {
		 * map.put("patient", patients123); List<Services> list1=
		 * patientsService.getservicedata(patients123.getName()); map.put("service",
		 * list1); return "patientSerivce";
		 * 
		 * }
		 * 
		 */
	
	
	}

	


