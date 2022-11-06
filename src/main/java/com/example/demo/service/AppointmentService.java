
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
	  return "appointment"; 
  }
  
  
  public String viewAppointment(  String patientName,long mobileNumber, String doctorName, Date date,String Address,
		    ModelMap modelMap) {
	   Appointment appointment=new Appointment();
	   appointment.setPatientName(patientName);
	   appointment.setMobileNumber(mobileNumber);
	   appointment.setDoctorName(doctorName);
	   appointment.setDate(date);
	   appointment.setAddress(Address);
	   this.appointmentRepository.save(appointment);
	
  modelMap.put("appointmentId", appointment.getAppointmentId());
  modelMap.put("patientName", patientName);
  modelMap.put("mobileNumber", mobileNumber);
  modelMap.put("doctorName", appointment.getDoctorName());
  modelMap.put("date", appointment.getDate());
  modelMap.put("Address", Address);
	return "displayAppointment";
	}
  
  public List<Appointment> findHistory(String patientDetailsName) {
		List<Appointment> result=appointmentRepository.findAllByPatientName(patientDetailsName);
			return result;
		}
		

 
  
  }
 