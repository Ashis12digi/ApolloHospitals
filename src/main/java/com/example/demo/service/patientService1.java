package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Patients;

public interface patientService1 {
	public void DeletePatient(int id);

	//Patients patientUpdateFactching(String emailid);
	Patients PatientUpdate(HttpServletRequest request) throws ParseException;
	
}
