package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.dto.EmployeeRecord;

public interface QueryRepository1 extends JpaRepository<EmployeeRecord, Integer> {
	
	@Query("select e from EmployeeRecord e where id= ?1")
	EmployeeRecord findById(int id);
}
