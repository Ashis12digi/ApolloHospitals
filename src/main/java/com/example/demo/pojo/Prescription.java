package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Prescription {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prescriptionid;

	@Column
	private String patientname;
	@Column 
	private Integer appointmentid;
	@Column
	private String description;

	public Prescription() {
		
	}

	public Prescription(int prescriptionid, String patientname, Integer appointmentid, String description) {
		super();
		this.prescriptionid = prescriptionid;
		this.patientname = patientname;
		this.appointmentid = appointmentid;
		this.description = description;
	}

	public int getPrescriptionid() {
		return prescriptionid;
	}

	public void setPrescriptionid(int prescriptionid) {
		this.prescriptionid = prescriptionid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public Integer getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(Integer appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Prescription [prescriptionid=" + prescriptionid + ", patientname=" + patientname + ", appointmentid="
				+ appointmentid + ", description=" + description + "]";
	}

	
	
	

}
