package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Integer>{

	Patients findByUsernameAndPassword(String username, String password);
    Patients findByusername(String username);
	Patients findByEmailid(String emailid);
	Patients findById(int id);
	
    
}
