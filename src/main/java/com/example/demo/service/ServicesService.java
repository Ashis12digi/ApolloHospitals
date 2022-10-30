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
	
public void Services(
	//	@RequestParam("serviceid") int  serviceid,
	//	@RequestParam("patientid") Integer patientid,
		@RequestParam("patientname") String patientname,
		@RequestParam("servicedetails") String servicedetails,
		@RequestParam("amount") double amount,
	
		ModelMap modelMap
		
		
		
		) {
  
	Services services= new Services();
	
	services.setServiceid(services.getServiceid());
//	services.setPatientid(patientid);
	services.setPatientname(patientname);
	services.setServicedetails(servicedetails);
	services.setAmount(amount);
	
	
	
 
	this.serviceRepository.save(services);
	
	modelMap.put("serviceid",services.getServiceid() );

  //modelMap.put("patientid", patientid);
modelMap.put("patientname", patientname);
modelMap.put("servicedetails", servicedetails);
modelMap.put("amount", amount);

//return "displayServices";


}
	
	

}
