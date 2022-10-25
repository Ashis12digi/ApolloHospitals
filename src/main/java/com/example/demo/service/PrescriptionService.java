package com.example.demo.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.Prescription;
import com.example.demo.repository.PrescriptionRepository;

@Service
@Component
public class PrescriptionService {


	@Autowired
	private PrescriptionRepository repository;
	
	public void save(Prescription Prescription) {
		repository.save(Prescription);
	}
	
	public List<Prescription> findByPatientName(String patientName){
		
			return repository.findByPatientName(patientName);
	}
}
