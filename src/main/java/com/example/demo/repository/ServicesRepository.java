package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends CrudRepository<Services, Integer> {

}
