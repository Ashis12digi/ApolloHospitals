package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.MedicineRepository;
import com.example.demo.repository.MedicineStoreRepository;
import com.example.demo.service.MedicineService;
import com.example.demo.service.MedicineStoreService;

@Controller
@Component
public class MedicineStoreController {

	@Autowired
	MedicineStoreService medicineStoreService;
//	MedicineRepository medicineRepository;
	@Autowired
	MedicineStoreRepository medicineStoreRepository;
	// MedicineService medicineService;

	@RequestMapping("/medicineform")
	public String medicine() {
		return medicineStoreService.medicine();
		// return medicineService.medicine();
	}

	/*
	 * @PostMapping("/medicine") public String viewMedicine(
	 * 
	 * // @RequestParam(required=false,name="patientid") Integer patientid,
	 * 
	 * @RequestParam(required = false, name = "patientname") String patientname,
	 * 
	 * @RequestParam(required = false, name = "medicinename") String medicinename,
	 * // @RequestParam( required=false,name="medicinetype") String medicinetype,
	 * 
	 * @RequestParam(required = false, name = "quantity") int quantity,
	 * 
	 * @RequestParam(required = false, name = "medicinecost") double medicinecost,
	 * 
	 * ModelMap modelMap)
	 * 
	 * { return medicineStoreService.viewMedicine(patientname, medicinename,
	 * quantity, medicinecost, modelMap); }
	 * 
	 */
	@PostMapping("/update/medicineInventory")
	public String updateMedicineInventory(
			@RequestParam(required = false, name = "patientname") String patientname,
			@RequestParam(required = false, name = "medicinename") String medicinename,
			@RequestParam(required = false, name = "quantity") int quantity,
			@RequestParam(required = false, name = "medicinecost") double medicinecost,
			ModelMap modelMap
			) {
		//medicineStoreService.updateMedicineInventory(patientname,medicinename, quantity,medicinecost,modelMap);
		return medicineStoreService.updateMedicineInventory(patientname, medicinename, quantity, medicinecost, modelMap);
	}
	

	 @GetMapping("/fetchmedicineinventory")
	  public String MedicineInventory(ModelMap model) {
		
		
		return medicineStoreService.MedicineInventory(model);
		  
	  }

}
