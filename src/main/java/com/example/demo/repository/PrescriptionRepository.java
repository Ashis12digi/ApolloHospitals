package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, String> {

	List<Prescription> findByPatientName(String patientName);
	
}
