package com.project.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.emp.entity.Employee;
import com.project.emp.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	@Autowired
	private  EmployeeRepository employeeRepository;
	
		
	
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("Tony", "Stark", "tony@gmail.com");
//		employeeRepository.save(employee1);
//		
//		Employee employee2 = new Employee("John", "Jacob", "john@gmail.com");
//		employeeRepository.save(employee2);
//		
//		Employee employee3 = new Employee("Bob", "Jr", "bob@gmail.com");
//		employeeRepository.save(employee3);
//		
//	}

}
