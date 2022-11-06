 package com.example.demo.controller;

import java.sql.Date;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.internal.build.AllowSysOut;
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

import java.util.*;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;

@Controller
@Component
public class MedicineController {
	
	MedicineService medicineService;
	
    public MedicineController(MedicineService medicineService) {
		this.medicineService = medicineService;
	}
	
  @RequestMapping("/medicineitems")
	  public String medicineform() {
	  return medicineService.medicineForm();
	  }
		
		@RequestMapping("/medicineInventory")
		  public String medicineformDetails() {
		  return medicineService.medicineFormDetails();
		  }
		
		
		@PostMapping("/update/Inventory")
		public String updateMedicineInventory(
				 @RequestParam (required=false,name="medicineName") String medicineName,
					@RequestParam( required=false,name="brand")  String brand,
					@RequestParam( required=false,name="madeIn")  String madeIn,
					@RequestParam( required=false,name="quantity")  int quantity,
					@RequestParam( required=false,name="medicineCost")  double medicineCost,
				ModelMap modelMap
				) {
			
			return medicineService.updateMedicineInventory( medicineName, brand, madeIn,quantity,medicineCost, modelMap);
		}
		
		 @GetMapping("/fetchMedicine")
		  public String Medicine(ModelMap model) {
			return medicineService.medicine(model);
			  
		  }
		 
		 @RequestMapping(value="/doctor/deleteMedicine/{medicineId}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("medicineId") int medicineId) { 
			 medicineService.deleteMedicine(medicineId);
	      return new ModelAndView("/deleteMedicine");
	      
	     }
			 
@GetMapping("/listOfMedicine")
 public String listOfMedicine(ModelMap model) {
	return medicineService.listOfMedicine(model);
	  
 }
	
@PostMapping("/searchMedicine")
public String serviceStatus(@RequestParam ("medicineId") int medicineId, HttpServletRequest request,ModelMap map){
	Medicine medicine= medicineService.findMedicine(medicineId);
		map.put("result", medicine);
	return  "specificMedicine";
	
}

@PostMapping("medicinePayment")
public String medicineConfirmData(ModelMap map,	@RequestParam("medicineId") int medicineId) {
	
	Medicine medicine= medicineService.findMedicine(medicineId); 
	map.put("medicineId", medicine.getMedicineId());
	map.put("medicineName", medicine.getMedicineName());
	map.put("quantity", medicine.getQuantity());
	map.put("medicineCost", medicine.getMedicineCost());
	return "confirmMedicine";
	
}

@RequestMapping("/paymentMedicine")
	public String medicinePayment(
			@RequestParam("number") double number, 
			@RequestParam("medicineCost") double medicineCost, HttpServletRequest request, ModelMap map) {
		double total=number*medicineCost;
		map.put("Total", total);
		return "medicineAmount";
	}
	
@RequestMapping("/paymentDoneMedicine")
public String paymentDone() {
return "servicePaymentDone";
}

@RequestMapping(value="/editMedicine", method=RequestMethod.GET)
public ModelAndView viewAll(@RequestParam("medicineId") int medicineId,ModelMap map) {
ModelAndView modelAndView=new ModelAndView("/updateMedicineDetails");
Medicine list=medicineService.medicineUpdateFetch(medicineId);
map.put("medicinedata", list);
return modelAndView; 
}

@PostMapping("/updateMedicine") 
public ModelAndView updateTable(HttpServletRequest request,ModelMap map){
ModelAndView modelAndView=new ModelAndView("/displayAllMedicine");
List<Medicine> medicineList= medicineService.medicineUpdate(request);
map.put("result", medicineList);
return modelAndView; 
}



}
