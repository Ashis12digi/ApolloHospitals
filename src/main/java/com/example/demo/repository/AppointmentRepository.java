package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{

}
