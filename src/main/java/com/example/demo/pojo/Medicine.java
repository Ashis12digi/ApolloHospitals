package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Medicine {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientid;
	private String patientname;
	private String medicinename;
	private String medicinetype;
	private int quantity;
	private double medicinecost;
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public String getMedicinetype() {
		return medicinetype;
	}
	public void setMedicinetype(String medicinetype) {
		this.medicinetype = medicinetype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getMedicinecost() {
		return medicinecost;
	}
	public void setMedicinecost(double medicinecost) {
		this.medicinecost = medicinecost;
	}
	@Override
	public String toString() {
		return "Medicine [patientid=" + patientid + ", patientname=" + patientname + ", medicinename=" + medicinename
				+ ", medicinetype=" + medicinetype + ", quantity=" + quantity + ", medicinecost=" + medicinecost + "]";
	}
	 


}
