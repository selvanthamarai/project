package com.employee.services;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;


public interface EmployeeService {

	
    public Employee insertDetail(Employee employee);
	
	public List<Employee> get();
	
	public Optional<Employee> getid(long id);
	
	public Employee update(Employee employee);
	
	public void deleteall();
}
