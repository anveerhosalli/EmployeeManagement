package com.project.emp.service;

import java.util.List;

import com.project.emp.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployee(Long id);
	
	List<Employee> getAllEmployees();
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployee(Long id);
	

}
