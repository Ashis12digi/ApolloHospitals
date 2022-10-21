package com.example.demo.controller;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;

@Controller
@Component
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	/*
	 * @Autowired DoctorRepository doctorRepository;
	 */
	
	@RequestMapping("/doctorlogin")
    public String Login() {
      return  doctorService.Login();
    }
	

	  @RequestMapping("/dregistration")
	  public String Registration() {
	   return doctorService.Registration();
	  }


		@PostMapping("/DRregsuccess")
		public String viewDetails(
	              @RequestParam("name") String name,
				@RequestParam("password")String password,
				@RequestParam("location")  String location,
				@RequestParam("gender")  String gender,
				@RequestParam("emailid")  String emailid,
			
				@RequestParam("timing")  Time timing,
				@RequestParam("fees")  int fees,
				@RequestParam("mobilenumber")  long mobilenumber,
				@RequestParam("info")  String info,
				@RequestParam("experience")  String experience,
				ModelMap modelMap
				
				)
		{
			return doctorService.viewDetails(name, password, location, gender, emailid,timing,fees, mobilenumber,info, experience, modelMap);
		}
		
	//	@GetMapping("/alldoctor")
		@GetMapping("/listdoctor")
	//	@PostMapping("/listdoctor")
	
	  public String getAllDoctors() { doctorService.getAllDoctors(); return
	  "alldoctor"; }
	 
		
		@RequestMapping("/dlogin")
		  public String DoctorHome() {
		   return doctorService.DoctorHome();
		  }
			/*
			 * @RequestMapping("/dlogin") public String getin() { doctorService.Gret();
			 * System.out.println("getting");
			 * 
			 * return "DrReqistSuccess";
			 * 
			 * }
			 */
		 
		
}
