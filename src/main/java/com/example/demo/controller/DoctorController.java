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
	DoctorService doctorService;
	
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	Doctor doctorDetails;

	@RequestMapping("/doctorlogin")
    public String login() {
      return  doctorService.login();
    }

	  @RequestMapping("/dregistration")
	  public String registration() {
	   return doctorService.registration();
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
		  public String doctorHome() {
		   return doctorService.doctorHome();
		  }
			
		@RequestMapping("/doctorAppointments")
		public String showDoctorAppointments(Model model) {
			return "doctorAppointments";
		}
	
		  @GetMapping("/doctorloginusername")
	    public String getDoctorLogin(@ModelAttribute("doctor")  Doctor doctor,HttpServletRequest request ) {
	    	Doctor doctorLogin=doctorService.getDoctorLogin(doctor.getUsername(),doctor.getPassword());
	    	if(Objects.nonNull(doctorLogin)) {
	   doctorDetails =doctorService.getSpecificData(request.getParameter("username"));
	    		return "doctorHome";
	    	}
	    	else {
	    		return "adminloginerror";
	    	}
	    }
		  
	   @GetMapping("/fetchalldoctor")
		  public String displayDoctor(ModelMap model) {
			return doctorService.displayDoctor(model);  
		  }
	   
	   @GetMapping("/deletedoctor")
	   public String deleteDoctor() {
		return "deleteDoctor";
		   
	   }

	   @GetMapping("/fetch")
		  public String doctor(ModelMap model) {
			return doctorService.doctor(model);
			  
		  }
	 
	   @RequestMapping(value="/doctor/deleteDoctor/{id}", method=RequestMethod.GET)
	     public ModelAndView delete(@PathVariable("id") int id) {
	      doctorService.deleteDoctor(id);
	      return new ModelAndView("/deleteDoctor");
	      
	     }
	
	   @GetMapping("/doctorprofile")
	    public String profile(ModelMap map) {
	        map.put("result", doctorDetails);
	        return "doctorprofile";
	  	    }
	   
	    @RequestMapping(value="/editDoctor", method=RequestMethod.GET)
	      public ModelAndView viewAll(@RequestParam("id") int id,ModelMap map) {
	       ModelAndView modelAndView=new ModelAndView("/updateDoctordetails");
	      Doctor list=doctorService.DoctorUpdateFetch(id);
	      map.put("doctordata", list);
	      return modelAndView;
	    }
	    
	    @PostMapping("/updateDoctor")
	    public ModelAndView updateTable(HttpServletRequest request,ModelMap map) throws Exception {
	         ModelAndView modelAndView=new ModelAndView("/doctorprofile");
	        Doctor doctor= doctorService.doctorUpdate(request);
	        map.put("result", doctor);
	         return modelAndView;
	    }
	    
	   
	   
	   
}
