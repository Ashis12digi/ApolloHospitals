package com.example.demo.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String name;
	@Column
	@Email
	private String password;
	@Column
	private String location;
	@Column
	private String gender;
	@Column
	private String emailid;
	@Column
	private String timing;
	@Column
	private int fees;
	@Column
	private long mobilenumber;
	@Column
	private String info;
	@Column
	private String experience;
	
	
	public Doctor() {
		
	}


	public Doctor(int id, String name, @Email String password, String location, String gender, String emailid,
			String timing, int fees, long mobilenumber, String info, String experience) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.location = location;
		this.gender = gender;
		this.emailid = emailid;
		this.timing = timing;
		this.fees = fees;
		this.mobilenumber = mobilenumber;
		this.info = info;
		this.experience = experience;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
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


	public long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
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
		return "Doctor [id=" + id + ", name=" + name + ", password=" + password + ", location=" + location + ", gender="
				+ gender + ", emailid=" + emailid + ", timing=" + timing + ", fees=" + fees + ", mobilenumber="
				+ mobilenumber + ", info=" + info + ", experience=" + experience + "]";
	}
	
	
		

}
