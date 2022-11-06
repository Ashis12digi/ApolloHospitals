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
 
  AppointmentService appointmentService;
	PatientsController patientsController;
	
  public AppointmentController(AppointmentService appointmentService, PatientsController patientsController) {
		this.appointmentService = appointmentService;
		this.patientsController = patientsController;
	}

  @RequestMapping("/appointmentForm")
  public String appointmentForm() {
  return appointmentService.AppointmentForm();
  }
  
	@PostMapping("/appointment")
	public String viewAppointment(
			@RequestParam( required=false,name="patientName")  String patientName,
			@RequestParam( required=false,name="mobileNumber")  long mobileNumber,
			@RequestParam( required=false,name="doctorName")  String doctorName,
		    @RequestParam (required=false,name="date") java.sql.Date date,
		    @RequestParam( required=false,name="Address")  String Address,
		
			ModelMap modelMap)
	{
		return appointmentService.viewAppointment(patientName,mobileNumber, doctorName, date, Address,modelMap);
		}
	
	@RequestMapping("/appointmentHistory")
	public String checkHistory(ModelMap modelMap) {
		String patientDetailsName=patientsController.getFullName();
		String redirect="";
		List<Appointment> appointment= appointmentService.findHistory(patientDetailsName);
		modelMap.put("appointment", appointment);
		if(appointment.isEmpty()) {
			redirect= "appointmentFailed";
		}
		else {
			return "historyAppointment";
		}
		return redirect;
		
	}
	
  }
  
 