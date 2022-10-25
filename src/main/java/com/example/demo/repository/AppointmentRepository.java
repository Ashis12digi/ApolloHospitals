/*
 * package com.example.demo.repository;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.Modifying; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.CrudRepository; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.example.demo.pojo.Appointment;
 * 
 * @Repository public interface AppointmentRepository extends
 * CrudRepository<Appointment, Integer>{
 * 
 * 
 * List<Appointment> findByDoctorName(String doctorName);
 * 
 * 
 * List<Appointment> findByPatientName(String patientName);
 * 
 * @Modifying
 * 
 * @Query("update Appointment  set confirmed = ?1 where appointmentid = ?2") int
 * setConfirmation(String confitmation, Integer id);
 * 
 * 
 * @Modifying
 * 
 * @Query("update Appointment  set prescription = ?1 where appointmentid = ?2")
 * int setPrescription(String prescription, Integer id);
 * 
 * @Query(
 * value="select * from Appointment  where appointmentdate =?1 AND doctorname =?2"
 * , nativeQuery=true) List<Appointment> findByDate(String date,String
 * doctorName);
 * 
 * 
 * }
 */