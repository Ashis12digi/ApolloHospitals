package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.MedicineStore;

@Repository
public interface MedicineStoreRepository extends CrudRepository<MedicineStore, Integer>{

}
