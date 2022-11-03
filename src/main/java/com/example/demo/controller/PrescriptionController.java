package com.example.demo.controller;

import java.util.ArrayList;
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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.pojo.Patients;
import com.example.demo.pojo.Prescription;
import com.example.demo.repository.PrescriptionRepository;
//import com.example.demo.service.AppointmentService;
import com.example.demo.service.PrescriptionService;

@Controller
@Component
public class PrescriptionController {

	@Autowired
    PrescriptionService prescriptionService;
	@Autowired
	PatientsController patientsController;
	@Autowired
	PrescriptionRepository prescriptionRepository;
	
	Prescription prescription;
	

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
			/*
			 * List<Prescription> listpre=new ArrayList(); String
			 * name=PatientsController.name; listpre=prescriptionService.getHistroy(name);
			 * modelMap.put("listpre", listpre);
			 */
		//	modelMap.put("id", id);
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
	
		@RequestMapping("/history")
		public String checkHistory(ModelMap modelMap) {
		
			String patientDetailsName=patientsController.GetFullName();
			System.out.println(patientDetailsName);
			//System.out.println(patientDetailsName+"in prescription controller");
	//String p=prescriptionRepository.findByPatientName();
			List<Prescription> prescription= prescriptionService.Findhistory(patientDetailsName);
			System.out.println(prescription);
			modelMap.put("prescription", prescription);
			return "HistoryPrescription";
		}
	

}
