/*
 * package com.example.demo.pojo;
 * 
 * import java.util.Date;
 * 
 * import javax.annotation.sql.DataSourceDefinition; import
 * javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.ManyToOne; import
 * javax.persistence.Table;
 * 
 * 
 * 
 * @Entity
 * 
 * @Table public class Appointment{
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY)
 * 
 * @Column private int appointmentid;
 * 
 * @Column private String patientid;
 * 
 *
 * 
 * @Column private Date date;
 * 
 
 * 
 * 
 * @ManyToOne(optional = true, fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "patientName") private Patients patients;
 * 
 * @ManyToOne(optional = true, fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "doctorName") private Doctor doctor;
 * 
 * public Appointment() {
 * 
 * }
 * 
 * public int getAppointmentid() { return appointmentid; }
 * 
 * public void setAppointmentid(int appointmentid) { this.appointmentid =
 * appointmentid; }
 * 
 * public String getPatientName() { return patientName; }
 * 
 * public void setPatientName(String patientName) { this.patientName =
 * patientName; }
 * 
 * public String getDoctorName() { return doctorName; }
 * 
 * public void setDoctorName(String doctorName) { this.doctorName = doctorName;
 * }
 * 
 * public Date getDate() { return date; }
 * 
 * public void setDate(Date date) { this.date = date; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public long getPhone() { return phone; }
 * 
 * public void setPhone(long phone) { this.phone = phone; }
 * 
 * public Patients getPatients() { return patients; }
 * 
 * public void setPatients(Patients patients) { this.patients = patients; }
 * 
 * public Doctor getDoctor() { return doctor; }
 * 
 * public void setDoctor(Doctor doctor) { this.doctor = doctor; }
 * 
 * public Appointment(int appointmentid, String patientName, String doctorName,
 * Date date, String email, long phone, Patients patients, Doctor doctor) {
 * super(); this.appointmentid = appointmentid; this.patientName = patientName;
 * this.doctorName = doctorName; this.date = date; this.email = email;
 * this.phone = phone; this.patients = patients; this.doctor = doctor; }
 * 
 * @Override public String toString() { return "Appointment [appointmentid=" +
 * appointmentid + ", patientName=" + patientName + ", doctorName=" + doctorName
 * + ", date=" + date + ", email=" + email + ", phone=" + phone + ", patients="
 * + patients + ", doctor=" + doctor + "]"; }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 */