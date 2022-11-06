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
	
	public String entry() {
		return "index";
	}

	public String login() {
		return "patientsLogin";
	}

	public String registration() {
		return "PatientsRegistration";
	}

	public String viewDetails( String patientName, String username, String password, String emailId, Date dateOfBirth,
	     String gender,String bloodGroup, String mobileNumber, String address,	ModelMap modelMap) {
		
		Patients patients=new Patients();
		patients.setId(patients.getId());
		patients.setPatientName(patientName);
		patients.setUsername(username);
		patients.setPassword(password);
		patients.setEmailId(emailId);
		patients.setDateOfBirth(dateOfBirth);
		patients.setGender(gender);
		patients.setBloodGroup(bloodGroup);
		patients.setMobileNumber(mobileNumber);
		patients.setAddress(address);
		this.patientsRepository.save(patients);
		
  	modelMap.put("id", patients.getId());
	modelMap.put("patientName",patientName);
	modelMap.put("username",username);
	modelMap.put("password", password);
	modelMap.put("emailId", emailId);
	modelMap.put("dateOfBirth", dateOfBirth);
	modelMap.put("gender", gender);
	modelMap.put("bloodGroup", bloodGroup);
	modelMap.put("mobileNumber", mobileNumber);
	modelMap.put("address", address);
	return "PatientRegistrationSuccess";
	
	}

	public Patients getPatientLogin(String userName, String password) {
		Patients patient=patientsRepository.findByUsernameAndPassword(userName,password);
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

public Patients getData(String userName) {
	Patients patient= patientsRepository.findByUsername(userName);
			return  patient;
}


public void deletePatient(int id) {
	patientsRepository.deleteById(id);
}


public Patients patientUpdateFactching(int id) {
	Patients patients=patientsRepository.findById(id);
	
	return patients;
}

public Patients patientUpdate(HttpServletRequest request) throws Exception {
	Patients patientsId= patientsRepository.findById(Integer.parseInt(request.getParameter("id")));
    Patients patients= new Patients();
    patients.setId(patientsId.getId());
    patients.setPatientName(request.getParameter("patientName"));
    patients.setUsername(request.getParameter("userName"));
    patients.setPassword(request.getParameter("password"));
    patients.setEmailId(request.getParameter("emailId"));
    String date=request.getParameter("dateOfBirth");
    Date dateFormat=new SimpleDateFormat("yyyy-MM-dd").parse(date);  
    patients.setDateOfBirth(dateFormat);
    patients.setGender(request.getParameter("gender"));
    patients.setBloodGroup(request.getParameter("bloodGroup"));
   patients.setMobileNumber(request.getParameter("mobileNumber"));
    patients.setAddress(request.getParameter("address"));
    this.patientsRepository.save(patients);
	
	return patients;
}
	

}
