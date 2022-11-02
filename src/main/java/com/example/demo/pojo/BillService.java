package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BillService {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BillNo;
	@Column
    private int serviceId;
    @Column
	private String patientname;
    @Column
	private String serviceName;
    @Column
    private int age;
    @Column
	private String gender;
    @Column
    private String mobilenumber;
    
	@Column
	private String bloodgroup;
	@Column
	private double amount;
	
	public BillService() {
		
	}

	public int getBillNo() {
		return BillNo;
	}

	public void setBillNo(int billNo) {
		BillNo = billNo;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BillService [BillNo=" + BillNo + ", serviceId=" + serviceId + ", patientname=" + patientname
				+ ", serviceName=" + serviceName + ", age=" + age + ", gender=" + gender + ", mobilenumber="
				+ mobilenumber + ", bloodgroup=" + bloodgroup + ", amount=" + amount + "]";
	}

	
	
	

}
