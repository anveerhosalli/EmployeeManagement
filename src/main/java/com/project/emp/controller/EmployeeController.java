package com.project.emp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.project.emp.entity.Employee;
import com.project.emp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		//Create Employee Object to hold employee form data
		Employee employee = new Employee();
		model.addAttribute("employee" , employee);
		return "create_employee";
	}
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/employees")
	public String getAllEmployees(Model model){
		model.addAttribute("employees" ,employeeService.getAllEmployees());
		return "employees";
	} 	
	
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id , Model model) {
		model.addAttribute("employee",employeeService.getEmployee(id));
		return "edit_employee";
	}
	
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id , 
			                     @ModelAttribute("employee") Employee employee,
			                     Model model) {
		Employee existingEmployee = employeeService.getEmployee(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeService.saveEmployee(existingEmployee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/remove/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}
	
	
}
