package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;

public interface doctorService1 {
	
//	public void DeleteDoctor(int id);
//	 public Doctor getDoctortById(int id);
	public void DeleteDoctor(int id);
	
	Doctor DoctorUpdate(HttpServletRequest request) throws ParseException;
	

}
