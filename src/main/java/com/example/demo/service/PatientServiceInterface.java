package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Patients;

public interface PatientServiceInterface {
	public void DeletePatient(int id);
	Patients PatientUpdate(HttpServletRequest request) throws Exception;
	
}
