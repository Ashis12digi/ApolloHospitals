package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Service
@Configuration
@Component
public class AppointmentService {

	public String AppointmentForm() {
		return "AppointmentForm";
	}

}
