package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.ServiceFacility;


@Repository
public interface ServiceFacilityRepository extends CrudRepository<ServiceFacility, Integer> {

	ServiceFacility findByServiceId(int serviceId);
	List<ServiceFacility> findAllByServiceName(String serviceName);

}
