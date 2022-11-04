package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Patients;

public interface PatientServiceInterface {
	public void deletePatient(int id);
	Patients patientUpdate(HttpServletRequest request) throws Exception;
	
}
