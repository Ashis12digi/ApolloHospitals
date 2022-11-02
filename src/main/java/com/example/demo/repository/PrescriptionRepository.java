package com.example.demo.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Prescription;
import com.example.demo.pojo.ServiceFacility;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Integer> {

	//ArrayList<Prescription> findByPatientname(String patientname);
	/*
	 * @Query("select p.description from Prescription p where p.patientname=patientDetailsName"
	 * ) public String findByPatientName();
	 */
	
	List<Prescription> findAllByPatientname(String patientname);
}
