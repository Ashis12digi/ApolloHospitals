package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Medicine;
import com.example.demo.pojo.MedicineStore;


@Repository
public interface MedicineRepository  extends CrudRepository<Medicine, Integer>{
	
Optional<Medicine> findBymedicinename(String medicinename);
	
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Medicine ms SET ms.quantity=:quantity WHERE ms.medicinename=:medicineName")
	int updateMeidicineInventory(@Param("quantity") int quantity, @Param("medicineName")String medicineName);

	Medicine findByMedicineId(int medicineId);

	
	
	

}
