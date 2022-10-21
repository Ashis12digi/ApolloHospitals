package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

}
