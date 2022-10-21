package com.example.demo.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Appointment{
	@Id
	@Column
	private int appointmentid;
	private String name;
	private String emailaddress;
	private long phonenumber;
	private Date date;
	public Appointment(int appointmentid, String name, String emailaddress, long phonenumber, Date date) {
		super();
		this.appointmentid = appointmentid;
		this.name = name;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.date = date;
	}
	public int getAppointmentid() {
		return appointmentid;
	}
	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentid=" + appointmentid + ", name=" + name + ", emailaddress=" + emailaddress
				+ ", phonenumber=" + phonenumber + ", date=" + date + "]";
	}
	
	
	
	
	
	}



