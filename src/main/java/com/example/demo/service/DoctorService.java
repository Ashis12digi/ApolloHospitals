package com.example.demo.service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
public class DoctorService implements DoctorServiceInterface{
	
	Doctor doctor;
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
				@RequestParam("timing")  String timing,
				@RequestParam("fees")  int fees,
				@RequestParam("mobilenumber")  String mobilenumber,
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
	
public String DoctorHome() {
		return "doctorHome";
	}
 
public Doctor GetDoctorLogin(String username, String password) {
	Doctor doctor=doctorRepository.findByUsernameAndPassword(username,password);
	return doctor;
	
}

public String DisplayDoctor(ModelMap model) {
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

//@Override
public void DeleteDoctor(int id) {
    doctorRepository.deleteById(id);
}

public Doctor GetSpecificData(String username) {
	Doctor doctor= doctorRepository.findByusername(username);
			return  doctor;
}

public Doctor DoctorUpdateFactching(int id) {
	doctor=doctorRepository.findById(id);
	System.out.println(doctor);
	return doctor;
}


//@Override
public Doctor DoctorUpdate(HttpServletRequest request) {
	Doctor doctorId= doctorRepository.findById(Integer.parseInt(request.getParameter("id")));
	Doctor doctor= new Doctor();
	
	doctor.setId(doctorId.getId());
	doctor.setName(request.getParameter("name"));
	doctor.setUsername(request.getParameter("username"));
	doctor.setPassword(request.getParameter("password"));
	doctor.setLocation(request.getParameter("location"));
    doctor.setGender(request.getParameter("gender"));
    doctor.setEmailid(request.getParameter("emailid"));
    doctor.setTiming(request.getParameter("timing"));
  int fees=Integer.parseInt(request.getParameter("fees"));
   doctor.setFees(fees);
    doctor.setMobilenumber(request.getParameter("mobilenumber"));
    doctor.setInfo(request.getParameter("info"));
    doctor.setExperience(request.getParameter("experience"));
    this.doctorRepository.save(doctor);
	
	return doctor;
}


}
