package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;

public interface MedicineServiceInterface {
	public void deleteMedicine(int medicineid);
	Medicine medicineUpdate(HttpServletRequest request);
		

}
