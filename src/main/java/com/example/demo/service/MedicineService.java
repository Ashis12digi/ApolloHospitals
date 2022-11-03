package com.example.demo.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Medicine;

import com.example.demo.pojo.Prescription;
import com.example.demo.pojo.ServiceFacility;
import com.example.demo.repository.MedicineRepository;

@Service
@Component
public class MedicineService implements MedicineServiceInterface{
	Medicine medicine;
	@Autowired
	MedicineRepository medicineRepository;

	public String MedicineForm() {
		return "medicineitem";
		
	}
	
	public String updateMedicineInventory(
		
			@RequestParam("medicinename") String medicinename,
			@RequestParam("brand") String brand,
			@RequestParam("madein") String madein,
			
			@RequestParam("quantity") int quantity,
			
			@RequestParam("medicinecost") double medicinecost,
			
			
			ModelMap modelMap
		
			) {
		
				
		Medicine medicinestore= new Medicine();

		medicinestore.setMedicinename(medicinename);
		medicinestore.setBrand(brand);
		medicinestore.setMadein(madein);
		medicinestore.setQuantity(quantity);
		medicinestore.setMedicinecost(medicinecost);
		
		medicineRepository.save(medicinestore); 
	
		  modelMap.put("medicinename", medicinename); 
		  modelMap.put("brand", brand);
		  modelMap.put("madein", madein);
		  modelMap.put("quantity", quantity); 
		  modelMap.put("medicinecost", medicinecost);
		   
		  return "displaymedicine";
	}

public String Medicine(ModelMap model) {
	
	  List<Medicine>medicine=new ArrayList<Medicine>();
	  medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	 return "displayAllMedicine";
}

public void DeleteMedicine(int medicineId) {
	medicineRepository.deleteById(medicineId);
}


public String MedicineFormDetails() {
	return "Inventory";
}

public String ListOfMedicine(ModelMap model) {
	 List<Medicine>medicine=new ArrayList<Medicine>();
	 medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	return "ListOfMedicine";
}

public Medicine MedicineUpdateFactching(int medicineId) {
	medicine=medicineRepository.findById(medicineId);
System.out.println(medicine); 
return medicine;
}

//@Override
public Medicine MedicineUpdate(HttpServletRequest request) {
Medicine medicine1=medicineRepository.findById(Integer.parseInt(request.getParameter("medicineId")));
Medicine medicine=new Medicine();
medicine.setMedicineId(medicine1.getMedicineId());

medicine.setMedicinename(request.getParameter("medicinename"));
medicine.setMedicinename(request.getParameter("brand"));
medicine.setMedicinename(request.getParameter("madein"));
medicine.setMedicinename(request.getParameter("quantity"));
//medicine.setMedicinename(request.getParameter("medicinecost"));
return medicine;
}




}
