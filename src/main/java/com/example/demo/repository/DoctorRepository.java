package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Doctor;
import com.example.demo.pojo.Patients;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

	Doctor findByUsernameAndPassword(String username, String password);

	Doctor findByusername(String username);
	Doctor findById(int id);
	
	
}
