package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.ServiceFacility;



@Repository
public interface MedicineRepository  extends CrudRepository<Medicine, Integer>{
	Medicine findByMedicineId(int medicineId);
    
	Medicine findById(int id);
	
	
	

}
