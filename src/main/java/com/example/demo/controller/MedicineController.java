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
	@Autowired
	MedicineRepository medicineRepository;
	@Autowired
	MedicineService medicineService;
    Medicine medicine;
	
  @RequestMapping("/medicineitems")
	  public String medicineform() {
	  return medicineService.medicineform();
	  }
		
		@RequestMapping("/medicineInventory")
		  public String medicineformDetails() {
		  return medicineService.medicineformDetails();
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
		
		//fetch
		 @GetMapping("/fetchmedicine")
		  public String Medicine(ModelMap model) {
			return medicineService.Medicine(model);
			  
		  }
		 
		 //Delete
		 @RequestMapping(value="/doctor/deleteMedicine/{medicineId}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("medicineId") int medicineId) {
			 System.out.println("come");
	         
			 medicineService.DeleteMedicine(medicineId);
	     System.out.println("comings");
	      return new ModelAndView("/DeleteMedicine");
	      
	     }
		 
	
		 
//display Medicine
@GetMapping("/listofMedicine")
 public String ListOfMedicine(ModelMap model) {
	
	
	return medicineService.ListOfMedicine(model);
	  
 }
	
@PostMapping("/SearchMedicine")
public String ServiceStatus(@RequestParam ("medicineId") int medicineId, HttpServletRequest request,ModelMap map){
	
	medicine=  medicineRepository.findByMedicineId(medicineId);
	System.out.println(medicine);
		map.put("result", medicine);
	return  "specificMedicine";
	
}


@GetMapping("medicinepayment")
public String Medicineconfirmdata(ModelMap map) {
	map.put("medicineId", medicine.getMedicineId());
	map.put("medicinename", medicine.getMedicinename());
	map.put("quantity", medicine.getQuantity());
	map.put("medicinecost", medicine.getMedicinecost());
		
	return "confirmMedicine";
	
}


@RequestMapping("/paymentmedicine")
	
	public String MedicinePayment(
			@RequestParam("num") double num, 
			@RequestParam("medicinecost") double medicinecost, HttpServletRequest request, ModelMap map) {
	
		//int n=Integer.parseInt(request.getParameter("price"));
		double total=num*medicinecost;
		map.put("Total", total);
		return "medicineAmount";
	}
	

@RequestMapping("/paymentdonemedicine")
public String paymentdone() {
return "servicepaymentdone";
}


//----------------------------------------------------------


@RequestMapping(value="/editMedicine", method=RequestMethod.GET)
public ModelAndView viewAll(@RequestParam("medicineId") int medicineId,ModelMap map) {
ModelAndView modelAndView=new ModelAndView("/updatemedicinedetails");
Medicine list=medicineService.MedicineUpdateFactching(medicineId);
map.put("userdata", list);

return modelAndView; 
}

@PostMapping("/updateMedicine") 
public ModelAndView updatetable(HttpServletRequest request,ModelMap map) throws ParseException {
ModelAndView modelAndView=new ModelAndView("/displayAllServiceFacility");
Medicine user= medicineService.MedicineUpdate(request);
map.put("result", user);
return modelAndView; 
}



}
