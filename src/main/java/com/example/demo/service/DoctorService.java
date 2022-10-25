package com.example.demo.service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.DoctorRepository;
@Component
@Service
public class DoctorService {
	@Autowired
	DoctorRepository doctorRepository;
	
	public String Login() {
		return  "DoctorLogin";
	}

	public String Registration() {
		return "DoctorRegistration";
	}
	
	
	public String viewDetails(
			   @RequestParam("name") String name,
			   @RequestParam("username") String username,
				@RequestParam("password")String password,
				@RequestParam("location")  String location,
				@RequestParam("gender")  String gender,
				@RequestParam("emailid")  String emailid,
		//		@RequestParam @DateTimeFormat(pattern = "MM:ss") Date timing;
				@RequestParam("timing")  Time timing,
				@RequestParam("fees")  int fees,
				@RequestParam("mobilenumber")  long mobilenumber,
				@RequestParam("info")  String info,
				@RequestParam("experience")  String experience,
				ModelMap modelMap
			
			
			
			) {
	
      Doctor doctor=new Doctor();
	
      doctor.setId(doctor.getId());
      doctor.setName(name);
      doctor.setUsername(username);
      doctor.setPassword(password);
      doctor.setLocation(location);
      doctor.setGender(gender);
      doctor.setEmailid(emailid);
      doctor.setTiming(timing);
      doctor.setFees(fees);
      doctor.setMobilenumber(mobilenumber);
      doctor.setInfo(info);
      doctor.setExperience(experience);
		
		this.doctorRepository.save(doctor);
		

  	modelMap.put("id", doctor.getId());
	modelMap.put("name",name);
	modelMap.put("username", username);
	modelMap.put("password", password);
	modelMap.put("location", location);
	modelMap.put("gender", gender);
	modelMap.put("emailid", emailid);
	modelMap.put("timing", timing);
	modelMap.put("fees", fees);
	modelMap.put("mobilenumber", mobilenumber);
	modelMap.put("info", info);
	modelMap.put("experience", experience);
	
	return "DrRegistSuccess";
	
	
	
	
	}
	/*
	 * public void Gret() { System.out.println("Comming");
	 * doctorRepository.findAll(); }
	 * 
	 * public List<Doctor> getAllDoctors() { List<Doctor> doctors = new
	 * ArrayList<Doctor>(); doctorRepository.findAll().forEach(i -> doctors.add(i));
	 * ModelMap mm=new ModelMap(); for(Doctor d:doctors) {
	 * 
	 * mm.put("d",d.getName()); }
	 * 
	 * 
	 * return doctors;
	 * 
	 * }
	 */
	 
	
	
	
	
public String DoctorHome() {
		
		return "doctorHome";
	}
	/*
	 * public ModelAndView getAllDoctors() { List<Doctor> alldoctor=(List<Doctor>)
	 * doctorRepository.findAll();
	 * 
	 * return new ModelAndView("alldoctor", "doctors",alldoctor);
	 * 
	 * }
	 */
	
	  public List<Doctor> allDoctor() 
	  {
		  List<Doctor>doctor=new ArrayList<>();
	  doctorRepository.findAll().forEach(i->doctor.add(i));
	  
	  return doctor;
	  }
	 
 

public Doctor getdoctorlogin(String username, String password) {
	Doctor doc=doctorRepository.findByUsernameAndPassword(username,password);
	return doc;
	
}
/*
 * public List<Doctor> getAllDoctor() {
 * 
 * return doctorRepository.findAll(); }
 */

public String displayDoctor(ModelMap model) {
	
	  List<Doctor>doctor=new ArrayList<Doctor>();
	 doctorRepository.findAll().forEach(i->doctor.add(i));
	 model.addAttribute("result", doctor);
	
	 return "displayAllDoctor";
}


public String Doctor(ModelMap model) {
	
	  List<Doctor>doctor=new ArrayList<Doctor>();
	 doctorRepository.findAll().forEach(i->doctor.add(i));
	 model.addAttribute("result", doctor);
	
	 return "displayAllDoctorFetchAdmin";
}
	
	
 
}
