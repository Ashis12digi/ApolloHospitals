package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Admin;

@Repository
public interface AdminRepository  extends CrudRepository<Admin, Integer>{
	Admin findByUserNameAndPassword(String userName, String password);
	

}
