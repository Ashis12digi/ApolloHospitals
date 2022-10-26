package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Feedback;
import com.example.demo.pojo.Medicine;
import com.example.demo.repository.FeedbackRepository;

@Service
@Component
public class FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;

	public String FeedbackForm() {
			
			return "feedbackform";
			
		}
	

	public String viewFeedback(
		//	@RequestParam("patientid") int patientid,
			@RequestParam("name") String name,
			@RequestParam("details") String details,
			ModelMap modelMap
			) {
		Feedback feedback= new Feedback();
		feedback.setPatientid(feedback.getPatientid());
		feedback.setName(name);
		feedback.setDetails(details);
		
	
		  this.feedbackRepository.save(feedback);
		  modelMap.put("patientid", feedback.getPatientid());
		  modelMap.put("name", name);
		  modelMap.put("details", details);
		  
		  return "displayfeedback";
		
	}

	

}
