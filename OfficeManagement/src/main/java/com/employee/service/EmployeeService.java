package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;

import com.employee.repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository emp;

	public Employee insertDetail(Employee C) {
		return emp.save(C);

	}

	public List<Employee> get() {
		return emp.findAll();
	}

	public Optional<Employee> getid(long id) {
		return emp.findById(id);
	}

	public Employee up(Employee D) {
		return emp.save(D);

	}

	public void deleteall() {
		emp.deleteAll();
	}

}
