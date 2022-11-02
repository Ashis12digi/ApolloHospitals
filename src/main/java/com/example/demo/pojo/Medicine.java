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
	private int medicineId;
	private String medicinename;
	private String brand;
	private String madein;
	private int quantity;
	private double medicinecost;
	
	
	public Medicine() {
		// TODO Auto-generated constructor stub
	}




	public int getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}


	public String getMedicinename() {
		return medicinename;
	}


	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getMadein() {
		return madein;
	}


	public void setMadein(String madein) {
		this.madein = madein;
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
		return "Medicine [medicineId=" + medicineId + ", medicinename=" + medicinename + ", brand=" + brand
				+ ", madein=" + madein + ", quantity=" + quantity + ", medicinecost=" + medicinecost + "]";
	}
	
	


}
