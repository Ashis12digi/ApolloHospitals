package com.example.demo.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.ServiceFacility;

public interface ServiceFacilityService1 {
	ServiceFacility ServiceUpdate(HttpServletRequest request) throws ParseException;
	

}
