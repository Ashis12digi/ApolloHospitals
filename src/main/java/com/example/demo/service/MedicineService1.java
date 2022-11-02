package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;

public interface MedicineService1 {
	public void DeleteMedicine(int medicineid);
	Medicine MedicineUpdate(HttpServletRequest request) throws ParseException;
		

}
