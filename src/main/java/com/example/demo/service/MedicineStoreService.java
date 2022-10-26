package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
	//	MedicineRepository medicineRepository;

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
			
			MedicineStore store= new MedicineStore();
		
			store.setPatientid(patientid);
			store.setPatientname(patientname);
			store.setMedicinename(medicinename);
			
			store.setMedicinetype(medicinetype); 
			store.setQuantity(quantity);
			store.setMedicinecost(medicinecost);
			  
			  this.medicineStoreRepository.save(store); modelMap.put("patientid", patientid);
			  modelMap.put("patientname", patientname); modelMap.put("patientid",
			  patientid); modelMap.put("medicinetype", medicinetype);
			  modelMap.put("quantity", quantity); modelMap.put("medicinecost",
			  medicinecost);
			  
			  
			  return "displaymedicine";
			
		}


}
