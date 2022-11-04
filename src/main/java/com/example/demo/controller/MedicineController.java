package com.example.demo.controller;

import java.sql.Date;
import java.text.ParseException;

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

import com.example.demo.repository.MedicineRepository;
import com.example.demo.service.MedicineService;
import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;

@Controller
@Component
public class MedicineController {
	
	MedicineService medicineService;
	
    public MedicineController(MedicineService medicineService) {
		this.medicineService = medicineService;
	}

	Medicine medicine;
	
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
				 @RequestParam (required=false,name="medicinename") String medicinename,
					@RequestParam( required=false,name="brand")  String brand,
					@RequestParam( required=false,name="madein")  String madein,
					@RequestParam( required=false,name="quantity")  int quantity,
					@RequestParam( required=false,name="medicinecost")  double medicinecost,
				ModelMap modelMap
				) {
			
			return medicineService.updateMedicineInventory( medicinename, brand, madein,quantity,medicinecost, modelMap);
		}
		
		 @GetMapping("/fetchmedicine")
		  public String Medicine(ModelMap model) {
			return medicineService.medicine(model);
			  
		  }
		 
		 @RequestMapping(value="/doctor/deleteMedicine/{medicineId}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("medicineId") int medicineId) { 
			 medicineService.deleteMedicine(medicineId);
	      return new ModelAndView("/DeleteMedicine");
	      
	     }
			 
@GetMapping("/listofMedicine")
 public String listOfMedicine(ModelMap model) {
	return medicineService.listOfMedicine(model);
	  
 }
	
@PostMapping("/SearchMedicine")
public String serviceStatus(@RequestParam ("medicineId") int medicineId, HttpServletRequest request,ModelMap map){
	Medicine medicine= medicineService.findMedicine(medicineId);
		map.put("result", medicine);
	return  "specificMedicine";
	
}

@GetMapping("medicinepayment")
public String medicineConfirmData(ModelMap map) {
	map.put("medicineId", medicine.getMedicineId());
	map.put("medicinename", medicine.getMedicinename());
	map.put("quantity", medicine.getQuantity());
	map.put("medicinecost", medicine.getMedicinecost());
		
	return "confirmMedicine";
	
}

@RequestMapping("/paymentmedicine")
	public String medicinePayment(
			@RequestParam("number") double number, 
			@RequestParam("medicinecost") double medicinecost, HttpServletRequest request, ModelMap map) {
		double total=number*medicinecost;
		map.put("Total", total);
		return "medicineAmount";
	}
	
@RequestMapping("/paymentdonemedicine")
public String paymentDone() {
return "servicepaymentdone";
}

@RequestMapping(value="/editMedicine", method=RequestMethod.GET)
public ModelAndView viewAll(@RequestParam("medicineId") int medicineId,ModelMap map) {
ModelAndView modelAndView=new ModelAndView("/updatemedicinedetails");
Medicine list=medicineService.medicineUpdate(medicineId);
map.put("medicinedata", list);
return modelAndView; 
}

@PostMapping("/updateMedicine") 
public ModelAndView updateTable(HttpServletRequest request,ModelMap map){
ModelAndView modelAndView=new ModelAndView("/displayAllMedicin");
Medicine mediicne= medicineService.medicineUpdate(request);
map.put("result", mediicne);
return modelAndView; 
}



}
