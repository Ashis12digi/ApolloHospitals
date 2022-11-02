package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ServiceFacility {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceId;
	@Column
	private String serviceName;
	@Column
	private double amount;
	
	public ServiceFacility(){
		
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ServiceFacility [serviceId=" + serviceId + ", serviceName=" + serviceName + ", amount=" + amount + "]";
	}

	
	
	
	

}
