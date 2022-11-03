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
	@Autowired
	PatientsService patientsService;

	@Autowired
	DoctorService doctorService;
	
	Appointment appointment;
	Patients patientsdetails;
 
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
			
			@RequestParam("patientname") String patientname,
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			@RequestParam("emailid")  String emailid,
			@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date dateofbirth,
			@RequestParam("gender")  String gender,
			@RequestParam("bloodgroup")  String bloodgroup,
			@RequestParam("mobilenumber")  String mobilenumber,
			@RequestParam("address")  String address,
			
			ModelMap modelMap)
		
		
	{
		return patientsService.viewDetails(patientname, username, password, emailid, dateofbirth, gender, bloodgroup, mobilenumber, address, modelMap);
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
	    public String Profile(ModelMap map) {
	       
	        map.put("result", patientsdetails);
	       PrescriptionController prescriptionController=new PrescriptionController();
	     Prescription prescription=  prescriptionController.prescription;
	     map.put("prescription", prescription);
	       return "Patientprofile";
	  	    }
	    
	    
	    public String GetFullName()
	    {
	    	String fullname=patientsdetails.getPatientname();
	    	return fullname;
	    }
	    
	
	    @RequestMapping(value="/doctor/deletePatient/{id}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("id") int id) {
	         
	    	patientsService.DeletePatient(id);
	     
	      return new ModelAndView("/deletePatient");
	      
	     }
	   
	    
     //----------------------Update------------------------------------
	    @RequestMapping(value="/editUser", method=RequestMethod.GET)
	      public ModelAndView viewAll(@RequestParam("id") int id,ModelMap map) {
	       ModelAndView modelAndView=new ModelAndView("/updateuserdetails");
	      Patients list=patientsService.PatientUpdateFactching(id);
	      map.put("userdata", list);
	  
	      return modelAndView;
	    }
	    
	    @PostMapping("/updateUser")
	    public ModelAndView UpdateTable(HttpServletRequest request,ModelMap map) throws Exception {
	         ModelAndView modelAndView=new ModelAndView("/Patientprofile");
	        Patients user= patientsService.PatientUpdate(request);
	        map.put("result", user);
	         return modelAndView;
	    }
	    
	    //............Validation...........
	    
	    @PostMapping("/patientloginusername")
	    public String GetPatientLogin(@ModelAttribute("patients") Patients patients,@RequestParam ("username") String username, HttpServletRequest request) {
	    	Patients patientLogin=patientsService.GetPatientLogin(patients.getUsername(),patients.getPassword());
	    	if(Objects.nonNull(patientLogin)) {
	    		
	    	//	patientsdetails =patientsService.getdata(request.getParameter("username"));
	    		patientsdetails=patientsService.GetData(username);
	    		System.out.println(patientsdetails);
	   
	    		return "patientHome";
	    	}
	    	else {
	    		return "adminloginerror";
	    	}	
	    }
	    
		@GetMapping("/Searchstatus1")
		public String Book(
				@RequestParam("serviceId") int serviceId, 
				@RequestParam("serviceName") String serviceName,
				@RequestParam("amount") double amount , ModelMap map) {
			
			System.out.println(patientsdetails);
			map.put("serviceId", serviceId);
			map.put("serviceName", serviceName);
			map.put("amount", amount);
			map.put("patientname", patientsdetails.getPatientname());
			map.put("mobilenumber", patientsdetails.getMobilenumber());
			return "BookedDetails";
			
		}
		
		@RequestMapping("/payment")
		public String ServicePayment(HttpServletRequest request, ModelMap map) {
			return "displayservicepayment";
		}
		  
	    
	    
	}

	


