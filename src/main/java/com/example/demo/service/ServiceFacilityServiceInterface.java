package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.pojo.ServiceFacility;

public interface ServiceFacilityServiceInterface {
	List<ServiceFacility> serviceUpdate(HttpServletRequest request) ;
	

}
