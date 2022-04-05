package com.employeedata.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeedata.employeemanagement.model.Employee;
import com.employeedata.employeemanagement.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Ram");
//		employee.setLastName("Yadav");
//		employee.setEmailId("ramyadav@gmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Shyam");
//		employee1.setLastName("Sharma");
//		employee1.setEmailId("shyamsharma@gmail.com");
//		employeeRepository.save(employee1);
	}
	
	

}
