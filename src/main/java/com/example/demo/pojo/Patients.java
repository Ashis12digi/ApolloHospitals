package com.example.demo.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patients {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String emailid;
	@Column
	private Date dateofbirth;
	@Column
	private String gender;
	@Column
	private String bloodgroup;
	@Column
	private long mobilenumber;
	@Column
	private String address;
	
	public Patients() {
		// TODO Auto-generated constructor stub
	}

	public Patients(int id, String name, String username, String password, String emailid, Date dateofbirth,
			String gender, String bloodgroup, long mobilenumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.mobilenumber = mobilenumber;
		this.address = address;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", emailid=" + emailid + ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", bloodgroup="
				+ bloodgroup + ", mobilenumber=" + mobilenumber + ", address=" + address + "]";
	}

	
	
	

}
