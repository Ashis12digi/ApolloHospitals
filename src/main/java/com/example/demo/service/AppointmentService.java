
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
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.AppointmentRepository;


  import com.example.demo.repository.AppointmentRepository;
  
  @Service
  @Component 
  public class AppointmentService {
	 
  AppointmentRepository appointmentRepository;
	  
  public AppointmentService(AppointmentRepository appointmentRepository) {
		this.appointmentRepository = appointmentRepository;
	}


public String AppointmentForm() 
  {
	  return "Appointment"; 
  }
  
  
  public String viewAppointment(  String patientname,long MobileNumber, String doctorname, Date date,String Address,
		    ModelMap modelMap) {
	   Appointment appointment=new Appointment();
	   appointment.setPatientname(patientname);
	   appointment.setMobileNumber(MobileNumber);
	   appointment.setDoctorname(doctorname);
	   appointment.setDate(date);
	   appointment.setAddress(Address);
	   this.appointmentRepository.save(appointment);
	
  modelMap.put("appointmentid", appointment.getAppointmentid());
  modelMap.put("patientname", patientname);
  modelMap.put("MobileNumber", MobileNumber);
  modelMap.put("doctorname", appointment.getDoctorname());
  modelMap.put("date", appointment.getDate());
  modelMap.put("Address", Address);
	return "DisplayAppointment";
	}
  
  public List<Appointment> findHistory(String patientDetailsName) {
		List<Appointment> result=appointmentRepository.findAllByPatientname(patientDetailsName);
			return result;
		}
		

 
  
  }
 