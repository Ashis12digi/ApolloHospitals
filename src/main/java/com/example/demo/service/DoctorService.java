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
	
	public String login() {
		return  "DoctorLogin";
	}

	public String registration() {
		return "DoctorRegistration";
	}
	
	public String viewDetails(String name,String username,String password, String location, String gender, String emailid,
 String timing, int fees,String mobilenumber,  String info, String experience,ModelMap modelMap) {
	
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
	
public String doctorHome() {
		return "doctorHome";
	}
 
public Doctor getDoctorLogin(String username, String password) {
	Doctor doctor=doctorRepository.findByUsernameAndPassword(username,password);
	return doctor;
	
}

public String displayDoctor(ModelMap model) {
	  List<Doctor>doctor=new ArrayList<Doctor>();
	 doctorRepository.findAll().forEach(i->doctor.add(i));
	 model.addAttribute("result", doctor);
	 return "displayAllDoctor";
}

public String doctor(ModelMap model) {
	  List<Doctor>doctor=new ArrayList<Doctor>();
	 doctorRepository.findAll().forEach(i->doctor.add(i));
	 model.addAttribute("result", doctor);
	 return "displayAllDoctorFetchAdmin";
}


public void deleteDoctor(int id) {
    doctorRepository.deleteById(id);
}

public Doctor getSpecificData(String username) {
	Doctor doctor= doctorRepository.findByusername(username);
			return  doctor;
}

public Doctor DoctorUpdateFetch(int id) {
	doctor=doctorRepository.findById(id);
	return doctor;
}


public Doctor doctorUpdate(HttpServletRequest request) {
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
