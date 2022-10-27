
  package com.example.demo.service;
  import java.sql.Date;
 // import java.util.Date;
import java.util.List; 
import java.util.Optional;
  import org.jvnet.hk2.annotations.Service; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import
  org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.AppointmentRepository;


  import com.example.demo.repository.AppointmentRepository;
  
  @Service
  @Component 
  public class AppointmentService {
	  @Autowired
	  private AppointmentRepository appointmentRepository;
	  
  public String AppointmentForm() 
  {
	  return "Appointment"; 
  }
  
  
  public String viewAppointment(
			
	
			
		
			//	@RequestParam @DateTimeFormat(pattern = "MM/dd/yyyy") Date date,
		//	@RequestParam(required=false,name="patientid")  int patientid,
			@RequestParam(required=false,name= "date") Date date,
			@RequestParam( required=false,name="doctorname")  String doctorname,
			ModelMap modelMap
			
			
			
			) {
	   Appointment appointment=new Appointment();
	 
	//   appointment.setPatientid(patientid);
	   
	   appointment.setDate(date);
	   appointment.setDoctorname(doctorname);
		
		this.appointmentRepository.save(appointment);
		

 
  modelMap.put("appointmentid", appointment.getAppointmentid());
//  modelMap.put("patientid", appointment.getPatientid());
  modelMap.put("date", appointment.getDate());
  modelMap.put("doctorname", appointment.getDoctorname());
	
	
	return "DisplayAppointment";
	
	
	}

 
  
  }
 