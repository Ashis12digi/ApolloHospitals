package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;
import com.example.demo.pojo.Services;
import com.example.demo.repository.ServiceFacilityRepository;

@Service
@Component
public class ServiceFacilityService {
	
	@Autowired
	ServiceFacilityRepository serviceFacilityRepository;
	
	

	public String ServiceFacilitydetails() {
		return "ServiceFacilityform";
		
	}

	public void ViewServicesFacility(
	           
				@RequestParam("serviceName") String serviceName,
				
				@RequestParam("amount") double amount,
			
				ModelMap modelMap
				) {
		  
		
			ServiceFacility serviceFacility=new ServiceFacility();
			serviceFacility.setServiceId(serviceFacility.getServiceId());
		
			serviceFacility.setServiceName(serviceName);
			serviceFacility.setAmount(amount);
		
			this.serviceFacilityRepository.save(serviceFacility);
			
		modelMap.put("serviceId",serviceFacility.getServiceId() );
		modelMap.put("serviceName", serviceName);
		modelMap.put("amount", amount);
	}
    //Display Services
	public String ServiceDisplay(ModelMap model) {
	
	  List<ServiceFacility>facility=new ArrayList<ServiceFacility>();
	  serviceFacilityRepository.findAll().forEach(i->facility.add(i));
	 model.addAttribute("result", facility);
	
	 return "displayAllServiceFacility";
}

	public String Facilitydetails() {
		
		return "servicefacility";
	}
  
	public String ServiceDisplayIndex(ModelMap model) {
		
		  List<ServiceFacility>facility=new ArrayList<ServiceFacility>();
		  serviceFacilityRepository.findAll().forEach(i->facility.add(i));
		 model.addAttribute("result", facility);
		
		 return "displayServiceFacilityIndex";
	}

	
	public List<ServiceFacility> getservicedata(String serviceName)
	{
		List<ServiceFacility> list1=new ArrayList<>();
		serviceFacilityRepository.findAllByServiceName(serviceName).forEach(x->list1.add(x));
		return list1;
		
	}
	
		
	}

	
	

