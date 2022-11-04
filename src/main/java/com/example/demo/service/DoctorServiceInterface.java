package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;

public interface DoctorServiceInterface {
	public void deleteDoctor(int id);
	Doctor doctorUpdate(HttpServletRequest request) ;
	

}
