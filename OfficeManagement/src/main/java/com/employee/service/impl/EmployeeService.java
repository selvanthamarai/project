package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;

import com.employee.repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee insertDetail(Employee employee) {
		return employeeRepository.save(employee);

	}

	public List<Employee> get() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getid(long id) {
		return employeeRepository.findById(id);
	}

	public Employee update(Employee employee) {
		return employeeRepository.save(employee);

	}

	public void deleteall() {
		employeeRepository.deleteAll();
	}

}
