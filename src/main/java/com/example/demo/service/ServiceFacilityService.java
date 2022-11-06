package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.Patients;
import com.example.demo.pojo.ServiceFacility;
import com.example.demo.repository.PatientsRepository;
import com.example.demo.repository.ServiceFacilityRepository;

@Service
@Component
public class ServiceFacilityService implements ServiceFacilityServiceInterface{


	ServiceFacilityRepository serviceFacilityRepository;
	
	public ServiceFacilityService(ServiceFacilityRepository serviceFacilityRepository) {
		this.serviceFacilityRepository = serviceFacilityRepository;
	}
	
	ServiceFacility serviceFacility;

	public String serviceFacilityDetails() {
		return "serviceFacilityForm";
		
	}

	public void viewServicesFacility(String serviceName,double amount,ModelMap modelMap) {
			ServiceFacility serviceFacility=new ServiceFacility();
			serviceFacility.setServiceId(serviceFacility.getServiceId());
			serviceFacility.setServiceName(serviceName);
			serviceFacility.setAmount(amount);
		
			this.serviceFacilityRepository.save(serviceFacility);
			
		modelMap.put("serviceId",serviceFacility.getServiceId() );
		modelMap.put("serviceName", serviceName);
		modelMap.put("amount", amount);
	}
   
	public String serviceDisplay(ModelMap model) {
	  List<ServiceFacility>facility=new ArrayList<ServiceFacility>();
	  serviceFacilityRepository.findAll().forEach(i->facility.add(i));
	 model.addAttribute("result", facility);
	 return "displayAllServiceFacility";
}

	public String facilityDetails() {
		return "serviceFacility";
	}
  
	public String serviceDisplayIndex(ModelMap model) {
		  List<ServiceFacility>facility=new ArrayList<ServiceFacility>();
		  Patients patients= new Patients();
		 List<Patients> patient= new ArrayList<>();
		  serviceFacilityRepository.findAll().forEach(i->facility.add(i)); 
		 model.addAttribute("result", facility);
		 return "displayServiceFacilityIndex";
	}
	
	public String serviceDisplayIndexBeforeLogin(ModelMap model) {
		  List<ServiceFacility>facility=new ArrayList<>();
		  serviceFacilityRepository.findAll().forEach(i->facility.add(i));
		 model.addAttribute("result", facility);
		 return "BeforeLogin";
	}

	
	public List<ServiceFacility> getServiceData(String serviceName)
	{
		List<ServiceFacility> list=new ArrayList<>();
		serviceFacilityRepository.findAllByServiceName(serviceName).forEach(x->list.add(x));
		return list;
		
	}
	
	public void deleteService(int serviceId) {
    serviceFacilityRepository.deleteById(serviceId);

	}
	
	  public ServiceFacility ServiceUpdateFactching(int serviceId) {
	  serviceFacility=serviceFacilityRepository.findById(serviceId); 
	  return serviceFacility;
	  }
	 

	  public List<ServiceFacility> serviceUpdate(int id, String serviceName)  {
		  
	  ServiceFacility serviceFacility=serviceFacilityRepository.findById(id);
	  serviceFacility.setServiceName(serviceName);
	  serviceFacilityRepository.save(serviceFacility);
	  List<ServiceFacility> list= new ArrayList();
	  serviceFacilityRepository.findAll().forEach(x->list.add(x));
	  return list;
	  }
	 
	
		
	}

	
	

