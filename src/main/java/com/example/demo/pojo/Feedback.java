package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Entity
@Table
public class Feedback {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientid;
	private String name;
	private String details;
	public Feedback(int patientid, String name, String details) {
		super();
		this.patientid = patientid;
		this.name = name;
		this.details = details;
	}
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Feedback [patientid=" + patientid + ", name=" + name + ", details=" + details + "]";
	}
	
	

}
