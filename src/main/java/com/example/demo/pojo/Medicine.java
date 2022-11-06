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
	private String medicineName;
	private String brand;
	private String madeIn;
	private int quantity;
	private double medicineCost;
	
	
	public Medicine() {
		
	}


	public int getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}


	public String getMedicineName() {
		return medicineName;
	}


	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getMadeIn() {
		return madeIn;
	}


	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getMedicineCost() {
		return medicineCost;
	}


	public void setMedicineCost(double medicineCost) {
		this.medicineCost = medicineCost;
	}


	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", brand=" + brand
				+ ", madeIn=" + madeIn + ", quantity=" + quantity + ", medicineCost=" + medicineCost + "]";
	}

  


	


}
