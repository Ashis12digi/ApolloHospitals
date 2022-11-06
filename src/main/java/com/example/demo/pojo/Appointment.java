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
	private int appointmentId;
	@Column
   private String patientName;
   @Column
   private long mobileNumber;
   @Column
	private String doctorName;
	@Column
	private Date date;
	 @Column
	   private String Address;

	public Appointment() {
		
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
		return "Appointment [appointmentId=" + appointmentId + ", patientName=" + patientName + ", mobileNumber="
				+ mobileNumber + ", doctorName=" + doctorName + ", date=" + date + ", Address=" + Address + "]";
	}

	



	


	
	
	
	
}