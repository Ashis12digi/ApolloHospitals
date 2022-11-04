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

	Medicine medicine;
	
	public String medicineForm() {
		return "medicineitem";
		
	}
	
	public String updateMedicineInventory( String medicinename,String brand, String madein, int quantity,double medicinecost,
		ModelMap modelMap) {
		
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
	return "Inventory";
}

public String listOfMedicine(ModelMap model) {
	 List<Medicine>medicine=new ArrayList<Medicine>();
	 medicineRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	return "ListOfMedicine";
}

public Medicine medicineUpdate(int medicineId) {
	medicine=medicineRepository.findById(medicineId);
return medicine;
}

public Medicine medicineUpdate(HttpServletRequest request) {
Medicine medicine=medicineRepository.findById(Integer.parseInt(request.getParameter("medicineId")));
medicine.setMedicineId(medicine.getMedicineId());
medicine.setMedicinename(request.getParameter("medicinename"));
medicine.setMedicinename(request.getParameter("brand"));
medicine.setMedicinename(request.getParameter("madein"));
medicine.setMedicinename(request.getParameter("quantity"));
medicineRepository.save(medicine);
List<Medicine> list= new ArrayList();
medicineRepository.findAll().forEach(x->list.add(x));
return medicine;
}

   public Medicine findMedicine(int medicineId) {
	Medicine   medicine=  medicineRepository.findByMedicineId(medicineId);
	   return medicine;
   }


}
