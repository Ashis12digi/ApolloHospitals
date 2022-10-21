package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Patients;

@Repository
public interface PatientsRepository extends CrudRepository<Patients, Integer>{
  
//	@Query(value="select username,password from Patients", nativeQuery= true)
	//@Query("select * from Patients  where name = :name and password = :password")
	//public List<Patients> findPatientsByNameAndPassword(String username);
	
}
