package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class MedicineStore {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medicineid;
	@Column
	private String patientname;
	@Column
	private String medicinename;
	@Column
	private int quantity;
	@Column
	private double medicinecost;
	
	public MedicineStore(String patientname, String medicinename, int quantity, double medicinecost) {
		super();
		this.patientname = patientname;
		this.medicinename = medicinename;
		this.quantity = quantity;
		this.medicinecost = medicinecost;
	}
	public MedicineStore() {
		// TODO Auto-generated constructor stub
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
		return "MedicineStore [patientname=" + patientname + ", medicinename=" + medicinename + ", quantity=" + quantity
				+ ", medicinecost=" + medicinecost + "]";
	}
	
	

	
	
	
}
