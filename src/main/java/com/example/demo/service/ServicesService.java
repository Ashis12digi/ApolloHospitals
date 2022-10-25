package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.ServicesRepository;
import com.example.demo.pojo.*;


@Service
@Component
public class ServicesService {
	@Autowired
	ServicesRepository serviceRepository;

	public String Servicedetails() {
		
		return "Serviceform";
	}
	
	/*
	 * public String Services(ModelMap model) {
	 * 
	 * List<Services>service=new ArrayList<Services>();
	 * serviceRepository.findAll().forEach(i->service.add(i));
	 * model.addAttribute("result", service);
	 * 
	 * return "displayServices"; }
	 */
	
public String Services(
		@RequestParam("serviceid") int  serviceid,
		@RequestParam("patientid") int patientid,
		@RequestParam("patientname") String patientname,
		@RequestParam("servicedetails") String servicedetails,
		
	
		ModelMap modelMap
		
		
		
		) {
  
	Services services= new Services();
	
	services.setServiceid(serviceid);
	services.setPatientid(patientid);
	services.setPatientname(patientname);
	services.setServicedetails(servicedetails);
	
	
 
	this.serviceRepository.save(services);
	
	modelMap.put("serviceid", serviceid);

modelMap.put("patientid", patientid);
modelMap.put("patientname", patientname);
modelMap.put("servicedetails", servicedetails);


return "displayServices";


}
	
	

}
