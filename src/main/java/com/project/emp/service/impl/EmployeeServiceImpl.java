package com.project.emp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.emp.entity.Employee;
import com.project.emp.repository.EmployeeRepository;
import com.project.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
	
	/* we can ignore @Autowired if we have only one constructor
	 * as spring will use that constructor and inject all necessary
	 * dependencies
	 */
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
	} 


	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee updated";
	}


	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}

}
