package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Services {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceid;
	@Column
	private String patientname;
	@Column
	private String servicedetails;
	
	public Services() {
		
	}

	public Services(int serviceid, String patientname, String servicedetails) {
		super();
		this.serviceid = serviceid;
		this.patientname = patientname;
		this.servicedetails = servicedetails;
	}

	public int getServiceid() {
		return serviceid;
	}

	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getServicedetails() {
		return servicedetails;
	}

	public void setServicedetails(String servicedetails) {
		this.servicedetails = servicedetails;
	}

	@Override
	public String toString() {
		return "Services [serviceid=" + serviceid + ", patientname=" + patientname + ", servicedetails="
				+ servicedetails + "]";
	}

	
	

}
