package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.ServicesService;


@Controller
@Component
public class ServicesController {
	@Autowired
	ServicesService servicesService;
	 
	  @RequestMapping("/Service")
	  public String Servicedetails() {
	  return servicesService.Servicedetails();
	  }
	  
		/*
		 * @GetMapping("/fetchServices") public String Services(ModelMap model) {
		 * 
		 * 
		 * return servicesService.Services(model);
		 * 
		 * }
		 */
	  
	  @GetMapping("/fetchServices")
		//@PostMapping("/fetchServices")
		public String Services(
			
				@RequestParam(required=false,name="serviceid") Integer  serviceid,
				@RequestParam(required=false,name="patientid") Integer patientid,
				@RequestParam(required=false,name="patientname") String patientname,
				@RequestParam(required=false,name= "servicedetails") String servicedetails,
				
			
				ModelMap modelMap)
			
			
		{
			return servicesService.Services(serviceid, patientid, patientname,servicedetails, modelMap);
			}
		
}
