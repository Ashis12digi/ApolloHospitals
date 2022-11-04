package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Prescription;

import com.example.demo.repository.PrescriptionRepository;

@Service
@Component
public class PrescriptionService {

	 PrescriptionRepository prescriptionRepository;

   public PrescriptionService(PrescriptionRepository prescriptionRepository) {
		this.prescriptionRepository = prescriptionRepository;
	}
   

	public String prescriptionForm() {
		
		return "prescriptionform";
	}

	public String viewPrescription(	String  patientname,String description,ModelMap modelMap) {
		Prescription prescription=new Prescription();
		prescription.setPatientname(patientname);
		  prescription.setDescription(description);
			this.prescriptionRepository.save(prescription);
			
			modelMap.put("patientname", patientname);
           modelMap.put("description", description);
		return "viewPrescription";
	}


	public List<Prescription> findHistory(String patientDetailsName) {
	List<Prescription> result=	prescriptionRepository.findAllByPatientname(patientDetailsName);
		return result;
	}
	

	
	
}
