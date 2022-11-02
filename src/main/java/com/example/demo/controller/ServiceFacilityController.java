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
	
	ServiceFacility serviceFacility2;
	

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
	
	
	return serviceFacilityService.ServiceDisplayIndex1(model);
	  
 }

@RequestMapping("/displayServiceFacilityIndex")
public String AfterLogin(ModelMap model) {
	  return serviceFacilityService.ServiceDisplayIndex(model);
//  return "displayServiceFacilityIndex";


}

//@PostMapping("/Searchstatus")
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

@GetMapping("/patientservice")
public String profileService(ModelMap map) {
    map.put("patient", serviceFacility2);
    List<ServiceFacility> list1= serviceFacilityService.getservicedata(serviceFacility2.getServiceName());
    map.put("service", list1);
    return "patientSerivce";
    
}

@RequestMapping("/paymentdone")
public String paymentdone() {
return "servicepaymentdone";
}

@GetMapping("/Searchstatus")
public ModelAndView flightstatus(@RequestParam("serviceId") int serviceId, HttpServletRequest request,ModelMap map){
	System.out.println("Search");
	
	ModelAndView model= new ModelAndView("confirmservice");
	serviceFacility= serviceFacilityRepository.findByServiceId(serviceId);
	System.out.println(serviceFacility);
	request.setAttribute ("serviceFacility", serviceFacility);

	
	model.setViewName("confirmservice");
	

return model;

}


//Delete
@RequestMapping(value="/service/deleteMedicine/{serviceId}", method=RequestMethod.GET)
public ModelAndView delete(@PathVariable("serviceId") int serviceId) {
	 System.out.println("come");
    
	 serviceFacilityService.DeleteService(serviceId);
System.out.println("comings");
 return new ModelAndView("/DeleteMedicine");
 
}


//----------------------------------------------------------


  @RequestMapping(value="/editService", method=RequestMethod.GET)
  public ModelAndView viewAll(@RequestParam("serviceId") int serviceId,ModelMap map) {
  ModelAndView modelAndView=new ModelAndView("/updateservicedetails");
  ServiceFacility list=serviceFacilityService.ServiceUpdateFactching(serviceId);
  map.put("userdata", list);
  
  return modelAndView; 
  }
  
  @PostMapping("/updateService") 
  public ModelAndView updatetable(HttpServletRequest request,ModelMap map) throws ParseException {
  ModelAndView modelAndView=new ModelAndView("/displayAllServiceFacility");
  ServiceFacility user= serviceFacilityService.ServiceUpdate(request);
  map.put("result", user);
  return modelAndView; 
  }
 
 


}
