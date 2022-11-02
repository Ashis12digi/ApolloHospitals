package com.example.demo.repository;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Patients;
import com.example.demo.pojo.ServiceFacility;


@Repository
public interface ServiceFacilityRepository extends CrudRepository<ServiceFacility, Integer> {

	ServiceFacility findByServiceId(int serviceId);
	List<ServiceFacility> findAllByServiceName(String serviceName);

//	ServiceFacility PatientUpdate(HttpServletRequest request) throws ParseException;
	

}
