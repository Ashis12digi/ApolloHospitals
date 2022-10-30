package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.demo.pojo.Prescription;
import com.example.demo.pojo.Services;
//import com.example.demo.service.AppointmentService;
import com.example.demo.service.PrescriptionService;

@Controller
@Component
public class PrescriptionController {
	
	@Autowired
	private PrescriptionService prescriptionService;
	Prescription prescription1;

	  @RequestMapping("/Prescriptionform")
	  public String PrescriptionForm() {
	  return prescriptionService.PrescriptionForm();
	  }
	  
		@PostMapping("/displayPrescription")
		public String viewPrescription(
			
				@RequestParam("patientname") String patientname,

			

				@RequestParam("description") String description,
				
			
				ModelMap modelMap)
			
			
		{
			return prescriptionService.viewPrescription(patientname, description, modelMap);
			}
		

			/*
			 * @GetMapping("/patientservice1") public String profileService(ModelMap map) {
			 * map.put("patient", prescription1); List<Prescription> list1=
			 * prescriptionService.getPrescriptiondata(prescription1.getPatientname());
			 * map.put("service",list1); return "patientSerivce";
			 * 
			 * }
			 */
	
	

}
