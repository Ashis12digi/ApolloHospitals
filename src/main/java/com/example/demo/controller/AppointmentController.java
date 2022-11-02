
  package com.example.demo.controller;
  
  import java.util.Date;
import java.util.List;

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

import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;
 
 
  
  @Controller
  
  @Component 
  public class AppointmentController {
  
  @Autowired
  AppointmentRepository appointmentRepository;
  
  @Autowired 
  AppointmentService appointmentService;
  
  @Autowired
	PatientsController patientsController;
	
  
  @RequestMapping("/Appointmentform")
  public String AppointmentForm() {
  return appointmentService.AppointmentForm();
  }
  
	@PostMapping("/appointment")
	public String viewAppointment(
			
			
		//	@RequestParam(required=false,name="patientid") Integer patientid,
			@RequestParam( required=false,name="patientname")  String patientname,
			@RequestParam( required=false,name="MobileNumber")  long MobileNumber,
			@RequestParam( required=false,name="doctorname")  String doctorname,
			
			
		 @RequestParam (required=false,name="date") java.sql.Date date,
		 @RequestParam( required=false,name="Address")  String Address,
			
			
			ModelMap modelMap)
		
		
	{
		return appointmentService.viewAppointment(patientname,MobileNumber, doctorname, date, Address,modelMap);
		}
	//.............History.......
	
	@RequestMapping("/appointmentHistory")
	public String checkHistory(ModelMap modelMap) {
	
		String patientDetailsName=patientsController.getFullName();
		System.out.println(patientDetailsName);
		
		List<Appointment> appointment= appointmentService.FindHistory(patientDetailsName);
		System.out.println(appointment);
		modelMap.put("appointment", appointment);
		return "HistoryAppointment";
	}
	
  
  
  }
  
 