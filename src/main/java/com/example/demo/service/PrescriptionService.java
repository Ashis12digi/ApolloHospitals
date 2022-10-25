package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.PrescriptionRepository;

@Service
@Component
public class PrescriptionService {


	@Autowired
	private PrescriptionRepository prescriptionRepository;

	public String PrescriptionForm() {
		
		return "prescriptionform";
	}


	  public String viewPrescription(
				@RequestParam("patientname") String  patientname,
				@RequestParam("appointmentid") int appointmentid,
				@RequestParam("description") String description,
				
			
				ModelMap modelMap
				
				
				
				) {
		  
		  Prescription prescription= new Prescription();
		  prescription.setPatientname(patientname);
		  prescription.setAppointmentid(appointmentid);
		  prescription.setDescription(description);
		
			this.prescriptionRepository.save(prescription);
			
			modelMap.put("patientname", patientname);
   
     modelMap.put("appointmentid", appointmentid);
     modelMap.put("description", description);
    
		
		return "viewPrescription";
		
		
		}

	
	
}
