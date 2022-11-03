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
   private String patientname;
   @Column
   private long MobileNumber;
   @Column
	private String doctorname;
	@Column
	private Date date;
	 @Column
	   private String Address;

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public int getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(int appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentid=" + appointmentid + ", patientname=" + patientname + ", MobileNumber="
				+ MobileNumber + ", doctorname=" + doctorname + ", date=" + date + ", Address=" + Address + "]";
	}

	




	


	
	
	
	
}