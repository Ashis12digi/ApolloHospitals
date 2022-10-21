package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

@Controller
@Component
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepository adminRepository;
	
	@RequestMapping("/alogin")
    public String Login() {
      return  adminService.Login();
    }
	

	@RequestMapping("/aregist")
    public String Registration() {
      return  adminService.Registration();
    }
	
	@PostMapping("/aregist")
	public String viewDetails(
              @RequestParam("name") String name,
			@RequestParam("password")String password,
			@RequestParam("gender")  String gender,
			@RequestParam("emailid")  String emailid,
			@RequestParam("mobilenumber")  long mobilenumber,
			ModelMap modelMap
			
			)
	{
		return adminService.viewDetails(name, password, gender, emailid, mobilenumber, modelMap);
	}
	
	@RequestMapping("/adminlogin")
	  public String AdminHome() {
	   return adminService.AdminHome();
	  }
	

}
