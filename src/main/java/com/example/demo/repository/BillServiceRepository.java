package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.BillService;

@Repository
public interface BillServiceRepository extends CrudRepository<BillService, Integer> {

}
