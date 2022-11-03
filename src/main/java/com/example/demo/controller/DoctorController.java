package com.example.demo.controller;

import java.sql.Time;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;

@Controller
@Component
public class DoctorController {
	Doctor doctorDetails;
	@Autowired
	DoctorService doctorService;

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
	              @RequestParam("username") String username,
				@RequestParam("password")String password,
				@RequestParam("location")  String location,
				@RequestParam("gender")  String gender,
				@RequestParam("emailid")  String emailid,
			
				@RequestParam("timing")  String timing,
				@RequestParam("fees")  int fees,
				@RequestParam("mobilenumber")  String mobilenumber,
				@RequestParam("info")  String info,
				@RequestParam("experience")  String experience,
				ModelMap modelMap
				
				)
		{
			return doctorService.viewDetails(name,username, password, location, gender, emailid,timing,fees, mobilenumber,info, experience, modelMap);
		}
		
		@RequestMapping("/dlogin")
		  public String DoctorHome() {
		   return doctorService.DoctorHome();
		  }
			
		@RequestMapping("/doctorAppointments")
		public String ShowDoctorAppointments(Model model) {
			return "doctorAppointments";
		}
	
		  @GetMapping("/doctorloginusername")
	    public String GetDoctorLogin(@ModelAttribute("doctor")  Doctor doctor,HttpServletRequest request ) {
	    	Doctor doctorLogin=doctorService.GetDoctorLogin(doctor.getUsername(),doctor.getPassword());
	    	if(Objects.nonNull(doctorLogin)) {
	    		doctorDetails =doctorService.GetSpecificData(request.getParameter("username"));
	    		return "doctorHome";
	    	}
	    	else {
	    		return "adminloginerror";
	    	}
	    }
		  
	   @GetMapping("/fetchalldoctor")
		  public String DisplayDoctor(ModelMap model) {
			return doctorService.DisplayDoctor(model);
			  
		  }
	   
	   @GetMapping("/deletedoctor")
	   public String DeleteDoctor() {
		return "deleteDoctor";
		   
	   }
	   //..............fetching.......
	   @GetMapping("/fetch")
		  public String Doctor(ModelMap model) {
			
			
			return doctorService.Doctor(model);
			  
		  }
	   //......Delete........
	   @RequestMapping(value="/doctor/deleteDoctor/{id}", method=RequestMethod.GET)
	     public ModelAndView Delete(@PathVariable("id") int id) {
	         
	      doctorService.DeleteDoctor(id);
	     
	      return new ModelAndView("/deleteDoctor");
	      
	     }
	  //.....Profile.......
	   @GetMapping("/doctorprofile")
	    public String Profile(ModelMap map) {
	        map.put("result", doctorDetails);
	        return "doctorprofile";
	  	    }
	   
	   //------------------------update----------------------------------
	    @RequestMapping(value="/editDoctor", method=RequestMethod.GET)
	      public ModelAndView viewAll(@RequestParam("id") int id,ModelMap map) {
	       ModelAndView modelAndView=new ModelAndView("/updateDoctordetails");
	      Doctor list=doctorService.DoctorUpdateFactching(id);
	      map.put("userdata", list);
	  
	      return modelAndView;
	    }
	    
	    
	    @PostMapping("/updateDoctor")
	    public ModelAndView UpdateTable(HttpServletRequest request,ModelMap map) throws Exception {
	         ModelAndView modelAndView=new ModelAndView("/doctorprofile");
	        Doctor user= doctorService.DoctorUpdate(request);
	        map.put("result", user);
	         return modelAndView;
	    }
	    
	   
	   
	   
}
