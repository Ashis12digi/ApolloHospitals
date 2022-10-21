package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Patients;

@Repository
public interface PatientsRepository extends CrudRepository<Patients, Integer>{
  
	
	
}
