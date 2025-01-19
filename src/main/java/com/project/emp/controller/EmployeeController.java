package com.project.emp.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.project.emp.entity.Employee;
import com.project.emp.service.EmployeeService;

@RestController
@RequestMapping("/student")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public String createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/students")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
	
	

}
