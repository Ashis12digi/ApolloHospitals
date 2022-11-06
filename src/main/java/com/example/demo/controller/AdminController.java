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

	@RequestMapping("/adminLogin")
    public String login() {
      return  adminService.login();
    }
	
	@RequestMapping("/adminRegistration")
    public String registration() {
      return  adminService.registration();
    }
	
	@PostMapping("/adminViewDetails")
	public String viewDetails(
            @RequestParam("adminName") String adminName,
            @RequestParam("userName") String userName,
			@RequestParam("password")String password,
			@RequestParam("gender")  String gender,
			@RequestParam("emailId")  String emailId,
			@RequestParam("mobileNumber")  long mobileNumber,
			ModelMap modelMap)
	{
		return adminService.viewDetails(adminName,userName, password, gender, emailId, mobileNumber, modelMap);
	}
	
    @GetMapping("/fetchAllDoctor")
	public @ResponseBody List<Doctor>allDoctor(){
		return adminService.allDoctor();
	}
	
    @GetMapping("/adminLoginValidation")
    public String getLogin(@ModelAttribute("admin") Admin admin) {
    	Admin adminUserNameAndPassword=adminService.getLogin(admin.getUserName(),admin.getPassword());
    	if(Objects.nonNull(adminUserNameAndPassword)) {
    		return "adminHome";
    	}
    	else {
    		return "adminLoginError";
    	}
    }

    @RequestMapping("/contactUs")
    public String contactUs() {
      return  adminService.contactUs();
    }
	
    
   
}
