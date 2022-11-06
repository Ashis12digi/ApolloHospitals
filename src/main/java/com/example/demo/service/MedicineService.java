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


	MedicineRepository medicineRepository;

	public MedicineService(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}
	
	public String medicineForm() {
		return "medicineItem";
		
	}
	
	public String updateMedicineInventory( String medicineName,String brand, String madeIn, int quantity,double medicineCost,
		ModelMap modelMap) {
		
		Medicine medicinestore= new Medicine();
		medicinestore.setMedicineName(medicineName);
		medicinestore.setBrand(brand);
		medicinestore.setMadeIn(madeIn);
		medicinestore.setQuantity(quantity);
		medicinestore.setMedicineCost(medicineCost);
		
		medicineRepository.save(medicinestore); 
	
		  modelMap.put("medicineName", medicineName); 
		  modelMap.put("brand", brand);
		  modelMap.put("madeIn", madeIn);
		  modelMap.put("quantity", quantity); 
		  modelMap.put("medicineCost", medicineCost);
		   
		  return "displayMedicine";
	}

public String medicine(ModelMap model) {
	
	  List<Medicine>medicine=new ArrayList<Medicine>();
	  medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	 return "displayAllMedicine";
}

public void deleteMedicine(int medicineId) {
	medicineRepository.deleteById(medicineId);
}


public String medicineFormDetails() {
	return "inventory";
}

public String listOfMedicine(ModelMap model) {
	 List<Medicine>medicine=new ArrayList<Medicine>();
	 medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	return "listOfMedicine";
}

public Medicine medicineUpdateFetch(int medicineId) {
Medicine medicine=medicineRepository.findById(medicineId);
return medicine;
}

public List<Medicine> medicineUpdate(HttpServletRequest request) {
Medicine medicine=medicineRepository.findById(Integer.parseInt(request.getParameter("medicineId")));
medicine.setMedicineName(request.getParameter("medicineName"));
medicine.setBrand(request.getParameter("brand"));
medicine.setMadeIn(request.getParameter("madeIn"));
medicine.setQuantity(Integer.parseInt(request.getParameter("quantity")));
medicineRepository.save(medicine);
List<Medicine> list= new ArrayList();
medicineRepository.findAll().forEach(x->list.add(x));
return list;
}

   public Medicine findMedicine(int medicineId) {
	Medicine  medicine=  medicineRepository.findByMedicineId(medicineId);
	   return medicine;
   }


}
