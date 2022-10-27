
  package com.example.demo.repository;
  
  import java.util.List;
  import java.util.Date;
  
  import org.springframework.data.jpa.repository.Modifying; import
  org.springframework.data.jpa.repository.Query; import
  org.springframework.data.repository.CrudRepository; import
  org.springframework.stereotype.Repository;
  
  import com.example.demo.pojo.Appointment;
  
  @Repository
  public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{
  
  
  
  }
 