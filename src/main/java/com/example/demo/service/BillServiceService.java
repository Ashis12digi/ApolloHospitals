package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.BillServiceRepository;

@Service
@Component
public class BillServiceService {

	@Autowired
   BillServiceRepository billServiceRepository;

	
}
