
  package com.example.demo.controller;
  
  import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import
  org.springframework.stereotype.Component; import
  org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import
  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;
 
 
  
  @Controller
  
  @Component 
  public class AppointmentController {
  
  @Autowired
  AppointmentRepository appointmentRepository;
  
  @Autowired 
  AppointmentService appointmentService;
  
  @RequestMapping("/Appointmentform")
  public String AppointmentForm() {
  return appointmentService.AppointmentForm();
  }
  
	@PostMapping("/appointmnet")
	public String viewAppointment(
			
			
		//	@RequestParam(required=false,name="patientid") Integer patientid,
		 @RequestParam (required=false,name="date") java.sql.Date date,
			@RequestParam( required=false,name="doctorname")  String doctorname,
		
			
			ModelMap modelMap)
		
		
	{
		return appointmentService.viewAppointment( date, doctorname, modelMap);
		}
	
  
  
  }
  
 