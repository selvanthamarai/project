package com.employee.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;

import com.employee.service.impl.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("employee")
	public Employee insert(@RequestBody Employee employee) {
		return service.insertDetail(employee);

	}

	@GetMapping("employee")
	public List<Employee> getall() {
		return service.get();
	}

	@GetMapping("employee/{id}")
	public Optional<Employee> getById(@PathVariable long id) {
		return service.getid(id);
	}

	@PutMapping("employee/{id}")
	public Employee update(@PathVariable long id, @RequestBody Employee employee) {
		return service.update(employee);

	}

	@DeleteMapping("employee")
	public void delete() {
		service.deleteall();
	}

}
