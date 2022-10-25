package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.MedicineRepository;

@Service
@Component
public class MedicineService {
	@Autowired
	MedicineRepository medicineRepository;

	public String medicine() {
		
		return "medicineform";
		
	}
	

	public String viewMedicine(@RequestParam("patientid") int  patientid,
			@RequestParam("patientname") String patientname,
			@RequestParam("medicinename") String medicinename,
			@RequestParam("medicinetype") String medicinetype,
			
			@RequestParam("quantity") int quantity,
			
			@RequestParam("medicinecost") double medicinecost,
			
			
			
		
			ModelMap modelMap
			) {
		
		Medicine medicine=new Medicine();
		medicine.setPatientid(patientid);
		  medicine.setPatientname(patientname);
		  medicine.setMedicinename(medicinename);
		
		  medicine.setMedicinetype(medicinetype); 
		  medicine.setQuantity(quantity);
		  medicine.setMedicinecost(medicinecost);
		  
		  this.medicineRepository.save(medicine); modelMap.put("patientid", patientid);
		  modelMap.put("patientname", patientname); modelMap.put("patientid",
		  patientid); modelMap.put("medicinetype", medicinetype);
		  modelMap.put("quantity", quantity); modelMap.put("medicinecost",
		  medicinecost);
		  
		  
		  return "displaymedicine";
		
	}


}
