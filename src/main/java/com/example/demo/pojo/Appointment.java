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
public class Appointment{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appointmentid;

	
	@Column
	private Date date;
	
	@Column
	private String doctorname;
	
	
	

	public Appointment() {
		// TODO Auto-generated constructor stub
	}




	public Appointment(int appointmentid, Date date, String doctorname) {
		super();
		this.appointmentid = appointmentid;
		this.date = date;
		this.doctorname = doctorname;
	}




	public int getAppointmentid() {
		return appointmentid;
	}




	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public String getDoctorname() {
		return doctorname;
	}




	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}




	@Override
	public String toString() {
		return "Appointment [appointmentid=" + appointmentid + ", date=" + date + ", doctorname=" + doctorname + "]";
	}






	


	
	
	
	
}