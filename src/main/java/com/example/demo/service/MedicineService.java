package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.MedicineRepository;

@Service
@Component
public class MedicineService implements MedicineServiceDelete{
	@Autowired
	MedicineRepository medicineRepository;

	public String medicineform() {
		
		return "medicineitem";
		
	}
	

	public String viewMedicine(@RequestParam("medicineid") int  medicineid,
			@RequestParam("medicinename") String medicinename,
			@RequestParam("brand") String brand,
			@RequestParam("madein") String madein,
			
			@RequestParam("quantity") int quantity,
			
			@RequestParam("medicinecost") double medicinecost,
			
			
			
		
			ModelMap modelMap
			) {
		
		Medicine medicine=new Medicine();
		medicine.setMedicineid(medicineid);
		medicine.setMedicinename(medicinename);
		medicine.setBrand(brand);
		medicine.setMadein(madein);
		medicine.setQuantity(quantity);
		medicine.setMedicinecost(medicinecost);
		
		  this.medicineRepository.save(medicine);
		  modelMap.put("medicineid", medicineid);
		  modelMap.put("medicinename", medicinename); 
		  modelMap.put("brand", brand);
		  modelMap.put("madein", madein);
		  modelMap.put("quantity", quantity); 
		  modelMap.put("medicinecost", medicinecost);
		  
		  
		  return "displaymedicineitems";
		
	}

	

public String Medicine(ModelMap model) {
	
	  List<Medicine>medicine=new ArrayList<Medicine>();
	  medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	
	 return "displayAllMedicine";
}


@Override
public void DeleteMedicine(int medicineid) {
	medicineRepository.deleteById(medicineid);
}

}
