package com.example.demo.pojo;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;

@Entity
@Table
public class Doctor {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String doctorName;
	@Column(name = "username", unique = true)
   private String username;
	@Column
	private String password;
	@Column
	private String location;
	@Column
	private String gender;
	@Column(name = "emailId", unique = true)
	private String emailId;
	@Column
	private String timing;
	@Column
	private int fees;
	@Column
	private String mobileNumber;
	@Column
	private String info;
	@Column
	private String experience;
	
	
	public Doctor() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getTiming() {
		return timing;
	}


	public void setTiming(String timing) {
		this.timing = timing;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", username=" + username + ", password=" + password
				+ ", location=" + location + ", gender=" + gender + ", emailId=" + emailId + ", timing=" + timing
				+ ", fees=" + fees + ", mobileNumber=" + mobileNumber + ", info=" + info + ", experience=" + experience
				+ "]";
	}




	

	

	
		

}
