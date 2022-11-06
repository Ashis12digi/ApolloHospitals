package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.FeedbackRepository;
import com.example.demo.service.FeedbackService;

@Controller
@Component
public class FeedbackController {
	
	FeedbackService feedbackService;

	  public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	@RequestMapping("/feedback")
		  public String feedbackForm() {
		  return feedbackService.FeedbackForm();
		  }
	  
		@PostMapping("/feedbackDisplay")
		public String viewFeedback(
				
			 @RequestParam (required=false,name="name") String name,
				@RequestParam( required=false,name="details")  String details,
				ModelMap modelMap)
			
			
		{
			return feedbackService.viewFeedback(name,details, modelMap);
			}
		

}
