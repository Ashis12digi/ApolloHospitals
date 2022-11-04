package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.PatientsController;
import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Appointment;
import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.pojo.ServiceFacility;
import com.example.demo.repository.PatientsRepository;

@Component
@Service
public class PatientsService implements PatientServiceInterface{
	
	PatientsRepository patientsRepository;
	
	public PatientsService(PatientsRepository patientsRepository) {
	this.patientsRepository = patientsRepository;
}

	Patients patients;
	
	public String entry() {
		return "index";
	}

	public String login() {
		return "PatientsLogin";
	}

	public String registration() {
		return "PatientsRegistration";
	}

	public String viewDetails(
		 String patientname,
	     String username,
		 String password,
		 String emailid,
	     Date dateofbirth,
	     String gender,
		 String bloodgroup,
		 String mobilenumber,
		 String address,
			ModelMap modelMap) {
		
		Patients patients=new Patients();
		patients.setId(patients.getId());
		patients.setPatientname(patientname);
		patients.setUsername(username);
		patients.setPassword(password);
		patients.setEmailid(emailid);
		patients.setDateofbirth(dateofbirth);
		patients.setGender(gender);
		patients.setBloodgroup(bloodgroup);
		patients.setMobilenumber(mobilenumber);
		patients.setAddress(address);
		this.patientsRepository.save(patients);
		

  	modelMap.put("id", patients.getId());
	modelMap.put("patientname",patientname);
	modelMap.put("username",username);
	modelMap.put("password", password);
	modelMap.put("emailid", emailid);
	modelMap.put("dateofbirth", dateofbirth);
	modelMap.put("gender", gender);
	modelMap.put("bloodgroup", bloodgroup);
	modelMap.put("mobilenumber", mobilenumber);
	modelMap.put("address", address);
	return "Reg_Success";
	
	}

	public Patients getPatientLogin(String username, String password) {
		Patients patient=patientsRepository.findByUsernameAndPassword(username,password);
		return patient;
	}

	public String allLogin() {
		return "allLogin";
	}


public String patient(ModelMap model) {
	
	  List<Patients>patient=new ArrayList<Patients>();
	  patientsRepository.findAll().forEach(i->patient.add(i));
	 model.addAttribute("result", patient);
	 return "displayAllPatient";
}

public Patients getData(String username) {
	Patients patient= patientsRepository.findByusername(username);
			return  patient;
}


public void deletePatient(int id) {
	patientsRepository.deleteById(id);
}


public Patients patientUpdateFactching(int id) {
	patients=patientsRepository.findById(id);
	System.out.println(patients);
	return patients;
}


public Patients patientUpdate(HttpServletRequest request) throws Exception {
	Patients patientsId= patientsRepository.findById(Integer.parseInt(request.getParameter("id")));
    Patients patients= new Patients();
    patients.setId(patientsId.getId());
    patients.setPatientname(request.getParameter("patientname"));
    patients.setUsername(request.getParameter("username"));
    patients.setPassword(request.getParameter("password"));
    patients.setEmailid(request.getParameter("emailid"));
    String date=request.getParameter("dateofbirth");
    Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);  
    patients.setDateofbirth(date1);
    patients.setGender(request.getParameter("gender"));
    patients.setBloodgroup(request.getParameter("bloodgroup"));
   patients.setMobilenumber(request.getParameter("mobilenumber"));
    patients.setAddress(request.getParameter("address"));
    this.patientsRepository.save(patients);
	
	return patients;
}
	

}
