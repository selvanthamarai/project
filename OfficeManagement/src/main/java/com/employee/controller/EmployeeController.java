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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.ServiceException;
import com.employee.model.Employee;
import com.employee.service.impl.EmployeeServiceImpl;

@RequestMapping("employee")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl service;

	@PostMapping("create")
	public Employee insert(@RequestBody Employee employee) throws ServiceException {
		return service.insertDetail(employee);
	}
	@GetMapping("all")
	public List<Employee> getall() {
		return service.get();
	}
    @GetMapping("{id}")
	public Optional<Employee> getById(@PathVariable long id) {
		return service.getid(id);
	}
	@PutMapping("{id}")
	public Employee update(@PathVariable long id, @RequestBody Employee employee) {
		return service.update(employee);
	}
	@DeleteMapping
	public void delete() {
		service.deleteall();
	}
}
