package com.project.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.emp.entity.Employee;

/*no need to add @Repository on interface
 & no need to add @Transactional on each method,
JpaRepository interface takes care of that.
*/
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
