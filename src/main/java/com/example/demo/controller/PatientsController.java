package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.text.ParseException;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Patients;
import com.example.demo.pojo.Prescription;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientsRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientsService;
import com.example.demo.service.PrescriptionService;

@Controller
@Component
public class PatientsController {
	
	PatientsService patientsService;
	DoctorService doctorService;

	public PatientsController(PatientsService patientsService, DoctorService doctorService) {
		this.patientsService = patientsService;
		this.doctorService = doctorService;
	}

	Patients patientsDetails;
 
	  @RequestMapping("/") 
	  public String entry() 
	  {
		return patientsService.entry();
	  }
	 
	@RequestMapping("/patientLogin")
    public String login() {
		return patientsService.login();   
    }
	  @RequestMapping("/patientRegistration")
	  public String registration() {
	   return patientsService.registration();
	  }
	
	@PostMapping("/viewDetails")
	public String viewDetails(
			
			@RequestParam("patientName") String patientName,
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			@RequestParam("emailId")  String emailId,
			@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date dateOfBirth,
			@RequestParam("gender")  String gender,
			@RequestParam("bloodGroup")  String bloodGroup,
			@RequestParam("mobileNumber")  String mobileNumber,
			@RequestParam("address")  String address,
			
			ModelMap modelMap)
		
		
	{
		return patientsService.viewDetails(patientName, username, password, emailId, dateOfBirth, gender, bloodGroup, mobileNumber, address, modelMap);
	}

	    @RequestMapping("allLogin") 
		  public String allLogin() 
		  {
			return patientsService.allLogin();
		  }
    
	    @GetMapping("/fetchPatient")
		  public String patient(ModelMap model) {
			return patientsService.patient(model);  
		  }

	    @GetMapping("/patientProfile")
	    public String profile(ModelMap map) {
	        map.put("result", patientsDetails);
	       return "patientProfile";
	  	    }
	    
	    
	    public String getFullName()
	    {
	    	String fullName=patientsDetails.getPatientName();
	    	return fullName;
	    }
	    
	
	    @RequestMapping(value="/patient/deletePatient/{id}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("id") int id) {
	         
	    	patientsService.deletePatient(id);
	     
	      return new ModelAndView("/deletePatient");
	      
	     }
	   
	    @RequestMapping(value="/editPatient", method=RequestMethod.GET)
	      public ModelAndView viewAll(@RequestParam("id") int id,ModelMap map) {
	       ModelAndView modelAndView=new ModelAndView("/updatePatientDetails");
	      Patients list=patientsService.patientUpdateFactching(id);
	      map.put("userdata", list);
	  
	      return modelAndView;
	    }
	    
	    @PostMapping("/updatePatient")
	    public ModelAndView updateTable(HttpServletRequest request,ModelMap map) throws Exception {
	         ModelAndView modelAndView=new ModelAndView("/patientProfile");
	        Patients patient= patientsService.patientUpdate(request);
	        map.put("result", patient);
	         return modelAndView;
	    }
	    
	    
	    @PostMapping("/patientValidation")
	    public String getPatientLogin(@ModelAttribute("patients") Patients patients,@RequestParam ("username") String username, HttpServletRequest request) {
	    	Patients patientLogin=patientsService.getPatientLogin(patients.getUsername(),patients.getPassword());
	    	if(Objects.nonNull(patientLogin)) {
	    		patientsDetails=patientsService.getData(username);
	    		return "patientHome";
	    	}
	    	else {
	    		return "adminLoginError";
	    	}	
	    }
	    
		@GetMapping("/searchStatusService")
		public String book(
				@RequestParam("serviceId") int serviceId, 
				@RequestParam("serviceName") String serviceName,
				@RequestParam("amount") double amount , ModelMap map) {
			
			
			map.put("serviceId", serviceId);
			map.put("serviceName", serviceName);
			map.put("amount", amount);
			map.put("patientName", patientsDetails.getPatientName());
			map.put("mobileNumber", patientsDetails.getMobileNumber());
			return "bookedDetails";
			
		}
		
		@RequestMapping("/payment")
		public String servicePayment(HttpServletRequest request, ModelMap map) {
			return "displayServicePayment";
		}
		  
	    
	    
}
