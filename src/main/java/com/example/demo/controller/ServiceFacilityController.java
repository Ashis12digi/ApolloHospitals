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

import com.example.demo.pojo.Patients;
import com.example.demo.pojo.ServiceFacility;

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

@RequestMapping("/ServiceFacility")
public String ServiceFacilitydetails() {
return serviceFacilityService.ServiceFacilitydetails();
}

@GetMapping("/fetchServicesFecility")
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
	return serviceFacilityService.ServiceDisplayIndexBeforeLogin(model);
	  
 }

@RequestMapping("/displayServiceFacilityIndex")
public String AfterLogin(ModelMap model) {
	  return serviceFacilityService.ServiceDisplayIndex(model);
//  return "displayServiceFacilityIndex";


}


@GetMapping("/patientservice")
public String ProfileService(ModelMap map) {
    map.put("patient", serviceFacility);
    List<ServiceFacility> list= serviceFacilityService.GetServiceData(serviceFacility.getServiceName());
    map.put("service", list);
    return "patientSerivce";
    
}

@RequestMapping("/paymentdone")
public String PaymentDone() {
return "servicepaymentdone";
}




//Delete
@RequestMapping(value="/service/deleteMedicine/{serviceId}", method=RequestMethod.GET)
public ModelAndView Delete(@PathVariable("serviceId") int serviceId) {
    
	 serviceFacilityService.DeleteService(serviceId);
     return new ModelAndView("/DeleteMedicine");
 
}


//-----------------Update-----------------------------------------


  @RequestMapping(value="/editService", method=RequestMethod.GET)
  public ModelAndView viewAll(@RequestParam("serviceId") int serviceId,ModelMap map) {
  ModelAndView modelAndView=new ModelAndView("/updateservicedetails");
  ServiceFacility list=serviceFacilityService.ServiceUpdateFactching(serviceId);
  map.put("userdata", list);
  
  return modelAndView; 
  }
  
  @PostMapping("/updateService") 
  public ModelAndView UpdateTable(HttpServletRequest request,ModelMap map)  {
  ModelAndView modelAndView=new ModelAndView("/displayAllServiceFacility");
  ServiceFacility user= serviceFacilityService.ServiceUpdate(request);
  map.put("result", user);
  return modelAndView; 
  }
 
 


}
