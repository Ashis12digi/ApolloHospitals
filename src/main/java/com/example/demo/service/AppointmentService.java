/*
 * package com.example.demo.service;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * 
 * 
 * import org.jvnet.hk2.annotations.Service; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.stereotype.Component;
 * 
 * import com.example.demo.pojo.Appointment; import
 * com.example.demo.repository.AppointmentRepository;
 * 
 * @Service
 * 
 * @Configuration
 * 
 * @Component public class AppointmentService {
 * 
 * public String AppointmentForm() { return "AppointmentForm"; }
 * 
 * @Autowired
 * 
 * private AppointmentRepository appointmentRepository;
 * 
 * 
 * 
 * public List<Appointment> listAll(){ return (List<Appointment>)
 * appointmentRepository.findAll();
 * 
 * //return bookAppointment.findAll(); }
 * 
 * public void save(Appointment appointment) {
 * appointmentRepository.save(appointment); }
 * 
 * 
 * public void delete(Integer id) { appointmentRepository.deleteById(id); }
 * 
 * public int setConfirmation(String confirmation, Integer id) { return
 * appointmentRepository.setConfirmation(confirmation, id); }
 * 
 * 
 * public int setPrescription(String confirmation, Integer id) { return
 * appointmentRepository.setPrescription(confirmation, id); }
 * 
 * public Optional<Appointment> get(Integer id) { return
 * appointmentRepository.findById(id);
 * 
 * }
 * 
 * public List<Appointment> findByPatientName(String patientName) { return
 * appointmentRepository.findByPatientName(patientName); }
 * 
 * public List<Appointment> findByDoctorName(String doctorName) { return
 * appointmentRepository.findByDoctorName(doctorName); }
 * 
 * public List<Appointment> findByDate(String date, String doctorName){ return
 * appointmentRepository.findByDate(date, doctorName); }
 * 
 * 
 * }
 */