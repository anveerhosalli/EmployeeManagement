package com.project.emp.service;

import java.util.List;

import com.project.emp.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployee(Long id);
	
	List<Employee> getAllEmployees();
	
	String updateEmployee(Employee employee);
	
	String deleteEmployee(Long id);

}
