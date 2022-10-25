package com.example.demo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.MedicineRepository;
import com.example.demo.service.MedicineService;

@Controller
@Component
public class MedicineController {
	@Autowired
	MedicineRepository medicineRepository;
	@Autowired
	MedicineService medicineService;
	
	  @RequestMapping("/medicineform")
	  public String medicine() {
	  return medicineService.medicine();
	  }
	  
		@PostMapping("/medicine")
		public String viewMedicine(
				
				
				@RequestParam(required=false,name="patientid") Integer patientid,
			 @RequestParam (required=false,name="patientname") String patientname,
				@RequestParam( required=false,name="medicinename")  String medicinename,
				@RequestParam( required=false,name="medicinetype")  String medicinetype,
				
				@RequestParam( required=false,name="quantity")  int quantity,
				
				@RequestParam( required=false,name="medicinecost")  double medicinecost,
				
				
			
				
				ModelMap modelMap)
			
			
		{
			return medicineService.viewMedicine(patientid, patientname, medicinename,medicinetype,quantity,medicinecost, modelMap);
			}
		
	  
	

}
