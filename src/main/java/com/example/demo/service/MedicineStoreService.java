 package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.MedicineStore;
import com.example.demo.repository.MedicineRepository;
import com.example.demo.repository.MedicineStoreRepository;

@Service
@Component
public class MedicineStoreService {
	

		@Autowired
		MedicineStoreRepository medicineStoreRepository;
	
		public String medicine() {
			
			return "medicineform";
			
		}
		

		/*
		 * public String viewMedicine(
		 * 
		 * @RequestParam("patientname") String patientname,
		 * 
		 * @RequestParam("medicinename") String medicinename,
		 * 
		 * @RequestParam("quantity") int quantity,
		 * 
		 * @RequestParam("medicinecost") double medicinecost,
		 * 
		 * 
		 * 
		 * 
		 * ModelMap modelMap ) {
		 * 
		 * MedicineStore store= new MedicineStore();
		 * 
		 * 
		 * store.setPatientname(patientname); store.setMedicinename(medicinename);
		 * 
		 * 
		 * store.setQuantity(quantity); store.setMedicinecost(medicinecost);
		 * 
		 * medicineStoreRepository.save(store);
		 * 
		 * modelMap.put("patientname", patientname);
		 * 
		 * modelMap.put("medicinename", medicinename); modelMap.put("quantity",
		 * quantity); modelMap.put("medicinecost", medicinecost);
		 * 
		 * 
		 * return "displaymedicine";
		 * 
		 * }
		 */

		@Transactional
		public String updateMedicineInventory(
				@RequestParam("patientname") String patientname,
				@RequestParam("medicinename") String medicinename,
                @RequestParam("quantity") int quantity,
				@RequestParam("medicinecost") double medicinecost,
				ModelMap modelMap
			//	String medicineName, int quantity
				) {
			
			int finalQuantity = 0;
			
			Optional<MedicineStore> store = medicineStoreRepository.findBymedicinename(medicinename);
			if(!store.isEmpty()) {
				MedicineStore medicineStore = store.get();
				finalQuantity = medicineStore.getQuantity() - quantity;
			}
			
			int count = medicineStoreRepository.updateMeidicineInventory(finalQuantity, medicinename);
			System.out.println("Update rows for meidicineStore inventory" + count);
			
			MedicineStore medicinestore= new MedicineStore();
			medicinestore.setPatientname(patientname);
			medicinestore.setMedicinename(medicinename);
			medicinestore.setQuantity(quantity);
			medicinestore.setMedicinecost(medicinecost);
			  
			  medicineStoreRepository.save(medicinestore); 
			  modelMap.put("patientname", patientname);
			  modelMap.put("medicinename", medicinename);
			  modelMap.put("quantity", quantity);
			  modelMap.put("medicinecost",  medicinecost);
			  
			  
			  return "displaymedicine";
			

		}
		

public String MedicineInventory(ModelMap model) {
	
	  List<MedicineStore>medicine=new ArrayList<MedicineStore>();
	  medicineStoreRepository.findAll().forEach(i->medicine.add(i));
	 model.addAttribute("result", medicine);
	
	 return "medicineInventory";
}


}
