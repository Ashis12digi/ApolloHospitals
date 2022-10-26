package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component
public class PatientHistory {
	@Id
	@Column
	private int historyid;
	private String patientname;
	private String bookingconformation;
	private String useservices;

	
	PatientHistory(){
		
	}
	
}
