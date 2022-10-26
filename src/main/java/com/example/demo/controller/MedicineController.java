package com.example.demo.controller;

import java.sql.Date;

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

import com.example.demo.repository.MedicineRepository;
import com.example.demo.service.MedicineService;

@Controller
@Component
public class MedicineController {
	@Autowired
	MedicineRepository medicineRepository;
	@Autowired
	MedicineService medicineService;
	
  @RequestMapping("/medicineitems")
	  public String medicineform() {
	  return medicineService.medicineform();
	  }
	  
		@PostMapping("/medicineitems")
		public String viewMedicine(
				
				
				@RequestParam(required=false,name="medicineid") Integer medicineid,
			 @RequestParam (required=false,name="medicinename") String medicinename,
				@RequestParam( required=false,name="brand")  String brand,
				@RequestParam( required=false,name="madein")  String madein,
				
				@RequestParam( required=false,name="quantity")  int quantity,
				
				@RequestParam( required=false,name="medicinecost")  double medicinecost,
				
				
			
				
				ModelMap modelMap)
			
			
		{
			return medicineService.viewMedicine(medicineid, medicinename,brand,madein,quantity,medicinecost, modelMap);
			}
		
		 @GetMapping("/fetchmedicine")
		  public String Medicine(ModelMap model) {
			
			
			return medicineService.Medicine(model);
			  
		  }
		 
		 //Delete
		 @RequestMapping(value="/doctor/deleteMedicine/{medicineid}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("medicineid") int medicineid) {
	         
			 medicineService.DeleteMedicine(medicineid);
	     
	      return new ModelAndView("/DeleteMedicine");
	      
	     }
	

}
