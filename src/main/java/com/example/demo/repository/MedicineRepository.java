package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Medicine;

@Repository
public interface MedicineRepository  extends CrudRepository<Medicine, Integer>{
	

}
