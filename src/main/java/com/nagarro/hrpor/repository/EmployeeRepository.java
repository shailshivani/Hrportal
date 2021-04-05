package com.nagarro.hrpor.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagarro.hrpor.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("SELECT n FROM Employee n WHERE n.username = ?1")
	List<Employee> findemployeebyUsername(String usrname);
}