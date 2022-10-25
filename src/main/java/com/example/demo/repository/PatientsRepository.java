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
  
//	@Query(value="select username,password from Patients", nativeQuery= true)
	//@Query("select * from Patients  where name = :name and password = :password")
	//public List<Patients> findPatientsByNameAndPassword(String username);
	
	//Patients findByPatientnameAndPassword(String username,String password);

	
}
