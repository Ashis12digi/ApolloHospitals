package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;

public interface MedicineServiceInterface {
	public void deleteMedicine(int medicineId);
	List<Medicine> medicineUpdate(HttpServletRequest request);
		

}
