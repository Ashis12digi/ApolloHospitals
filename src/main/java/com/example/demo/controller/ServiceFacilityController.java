package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.ServiceFacility;
import com.example.demo.pojo.Services;
import com.example.demo.repository.ServiceFacilityRepository;
import com.example.demo.service.ServiceFacilityService;

@Controller
@Component
public class ServiceFacilityController 
{
	@Autowired
	ServiceFacilityService serviceFacilityService;
	@Autowired
	ServiceFacilityRepository serviceFacilityRepository;
	
	ServiceFacility serviceFacility;
	
	ServiceFacility serviceFacility2;
	

@RequestMapping("/ServiceFacility")
public String ServiceFacilitydetails() {
return serviceFacilityService.ServiceFacilitydetails();
}

@GetMapping("/fetchServicesFecility")
//@PostMapping("/fetchServices")
public String ViewServicesFacility(
	
		@RequestParam(required=false,name="serviceName") String serviceName,
		
		@RequestParam(required=false,name="amount") double amount,
	
		ModelMap modelMap)
	
	
{
	serviceFacilityService.ViewServicesFacility(serviceName,amount, modelMap);
	return "displayServicesFacility";
	}


@GetMapping("/fetchAllServices")
 public String ServiceDisplay(ModelMap model) {
	
	
	return serviceFacilityService.ServiceDisplay(model);
	  
 }


@RequestMapping("/ServiceFacilityindex")
public String Facilitydetails() {
return serviceFacilityService.Facilitydetails();
}


@GetMapping("/fetchAllServicesindex")
 public String ServiceDisplayIndex(ModelMap model) {
	
	
	return serviceFacilityService.ServiceDisplayIndex(model);
	  
 }

@PostMapping("/Searchstatus")
public String ServiceStatus(@RequestParam ("serviceId") int serviceId, HttpServletRequest request,ModelMap map){
	
		serviceFacility=  serviceFacilityRepository.findByServiceId(serviceId);
		map.put("result", serviceFacility);
	return  "specificservice";
	
}



@GetMapping("servicepayment")
public String serviceconfirmdata(ModelMap map) {
	map.put("serviceId", serviceFacility.getServiceId());
	map.put("serviceName", serviceFacility.getServiceName());
	map.put("amount", serviceFacility.getAmount());
	
		
	return "confirmservice";
	
}

@RequestMapping("/payment")
	
	public String Servicepayment( @RequestParam("amount") double amount, HttpServletRequest request, ModelMap map) {
	
		//int n=Integer.parseInt(request.getParameter("price"));
		double total=amount;
		map.put("Total", total);
		return "displayservicepayment";
	}
	




@GetMapping("/patientservice")
public String profileService(ModelMap map) {
    map.put("patient", serviceFacility2);
    List<ServiceFacility> list1= serviceFacilityService.getservicedata(serviceFacility2.getServiceName());
    map.put("service", list1);
    return "patientSerivce";
    
}

}
