package com.employeedata.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedata.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long>{
//		all CRUD database methods to interact with the database
	
}

