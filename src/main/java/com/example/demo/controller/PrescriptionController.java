package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    PrescriptionService prescriptionService;
	PatientsController patientsController;

	public PrescriptionController(PrescriptionService prescriptionService, PatientsController patientsController) {
		this.prescriptionService = prescriptionService;
		this.patientsController = patientsController;
	}

	  @RequestMapping("/Prescriptionform")
	  public String prescriptionForm() {
	  return prescriptionService.prescriptionForm();
	  }
	  
		@PostMapping("/displayPrescription")
		public String viewPrescription(
			
				@RequestParam("patientname") String patientname,
				@RequestParam("description") String description,
				ModelMap modelMap)
		{
			
			return prescriptionService.viewPrescription(patientname, description, modelMap);
			}
		
		@RequestMapping("/history")
		public String checkHistory(ModelMap modelMap) {
			String patientDetailsName=patientsController.getFullName();
			String redirect="";
			List<Prescription> prescription= prescriptionService.findHistory(patientDetailsName);
			modelMap.put("prescription", prescription);
			if(prescription.isEmpty())
			{
				redirect="prescriptionfailed";
			}
			
			else
			{
				redirect="HistoryPrescription";
				
			}
				return redirect;
		}
	

}
