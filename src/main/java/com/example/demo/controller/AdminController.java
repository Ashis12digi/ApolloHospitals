package com.example.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
import com.example.demo.service.DoctorService;

@Controller
@Component
public class AdminController {
	AdminService adminService;
	
	public AdminController(AdminService adminService) {
		this.adminService = adminService;
	}

	@RequestMapping("/alogin")
    public String login() {
      return  adminService.login();
    }
	
	@RequestMapping("/aregist")
    public String registration() {
      return  adminService.registration();
    }
	
	@PostMapping("/aregist")
	public String viewDetails(
            @RequestParam("name") String name,
            @RequestParam("username") String username,
			@RequestParam("password")String password,
			@RequestParam("gender")  String gender,
			@RequestParam("emailid")  String emailid,
			@RequestParam("mobilenumber")  long mobilenumber,
			ModelMap modelMap)
	{
		return adminService.viewDetails(name,username, password, gender, emailid, mobilenumber, modelMap);
	}
	
	@GetMapping("/fetchallpatients")
	public @ResponseBody List<Patients>allPatients(){
		return adminService.allPatients();
	}
	
    @GetMapping("/fetchAllDoctor")
	public @ResponseBody List<Doctor>allDoctor(){
		return adminService.allDoctor();
	}
	
    @GetMapping("/adminloginusername")
    public String getLogin(@ModelAttribute("admin") Admin admin) {
    	Admin adminUserNameAndPassword=adminService.getLogin(admin.getUsername(),admin.getPassword());
    	if(Objects.nonNull(adminUserNameAndPassword)) {
    		return "AdminHome";
    	}
    	else {
    		return "adminloginerror";
    	}
    }

    @RequestMapping("/contactus")
    public String contactUs() {
      return  adminService.contactUs();
    }
	
    
   
}
