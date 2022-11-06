package com.example.demo.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.lang.*;
import com.example.demo.pojo.Patients;
import com.example.demo.pojo.ServiceFacility;

import com.example.demo.repository.ServiceFacilityRepository;
import com.example.demo.service.ServiceFacilityService;

@Controller
@Component
public class ServiceFacilityController 
{
	ServiceFacilityService serviceFacilityService;

	public ServiceFacilityController(ServiceFacilityService serviceFacilityService) {
		this.serviceFacilityService = serviceFacilityService;
	}

	ServiceFacility serviceFacility;	

@RequestMapping("/serviceFacility")
public String serviceFacilityDetails() {
return serviceFacilityService.serviceFacilityDetails();
}

@GetMapping("/fetchServicesFecility")
public String viewServicesFacility(
	
		@RequestParam(required=false,name="serviceName") String serviceName,
		@RequestParam(required=false,name="amount") double amount,
		ModelMap modelMap)
{
	serviceFacilityService.viewServicesFacility(serviceName,amount, modelMap);
	return "displayServicesFacility";
	}

@GetMapping("/fetchAllServices")
 public String serviceDisplay(ModelMap model) {
	return serviceFacilityService.serviceDisplay(model);
	  
 }

@RequestMapping("/serviceFacilityIndex")
public String facilityDetails() {
return serviceFacilityService.facilityDetails();
}


@GetMapping("/fetchAllServicesIndex")
 public String serviceDisplayIndex(ModelMap model) {
	return serviceFacilityService.serviceDisplayIndexBeforeLogin(model);
	  
 }

@RequestMapping("/displayServiceFacilityIndex")
public String afterLogin(ModelMap model) {
	  return serviceFacilityService.serviceDisplayIndex(model);


}


@GetMapping("/patientservice")
public String profileService(ModelMap map) {
    map.put("patient", serviceFacility);
    List<ServiceFacility> list= serviceFacilityService.getServiceData(serviceFacility.getServiceName());
    map.put("service", list);
    return "patientSerivce";
    
}

@RequestMapping("/paymentDone")
public String paymentDone() {
return "servicePaymentDone";
}

@RequestMapping(value="/service/deleteMedicine/{serviceId}", method=RequestMethod.GET)
public ModelAndView delete(@PathVariable("serviceId") int serviceId) {
    
	 serviceFacilityService.deleteService(serviceId);
     return new ModelAndView("/DeleteMedicine");
 
}

  @RequestMapping(value="/editService", method=RequestMethod.GET)
  public ModelAndView viewAll(@RequestParam int serviceId,ModelMap map) {
  ModelAndView modelAndView=new ModelAndView("/updateServiceDetails");
  ServiceFacility list=serviceFacilityService.ServiceUpdateFactching(serviceId);
  map.put("servicedata", list);
  
  return modelAndView; 
  }
  
  @PostMapping("/updateService") 
  public ModelAndView updateTable(@RequestParam("serviceId") int id,@RequestParam("serviceName") String serviceName,ModelMap map)  {
  ModelAndView modelAndView=new ModelAndView("/displayAllServiceFacility");
  List<ServiceFacility> list= serviceFacilityService.serviceUpdate(id,serviceName);
  map.put("result", list);
  return modelAndView; 
  }
 
 


}
