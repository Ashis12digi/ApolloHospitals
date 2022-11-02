package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.BillServiceService;

@Controller
@Component
public class BillServiceController {
	@Autowired
	BillServiceService billServiceService;
	/*
	 * @GetMapping("/Searchstatus1") public String Book(@RequestParam("serviceId")
	 * int serviceId,
	 * 
	 * @RequestParam("serviceName") String serviceName, @RequestParam("amount")
	 * double amount , ModelMap map) {
	 * 
	 * System.out.println(serviceId+serviceName); map.put("serviceId", serviceId);
	 * map.put("serviceName", serviceName); map.put("amount", amount); //
	 * map.put("patientname", patientname); // map.put("mobilenumber",
	 * mobilenumber); return "BookedDetails";
	 * 
	 * 
	 * }
	 */
	


}
