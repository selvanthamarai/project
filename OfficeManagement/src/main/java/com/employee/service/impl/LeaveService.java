package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.model.Leave;
import com.employee.repository.LeaveRepository;
@Component
public class LeaveService {
	@Autowired
	private LeaveRepository repository;

	public Leave putLeave(Leave  put) {
		return repository.save(put);
	}

	public List<Leave> getAll() {
		return (List<Leave>) repository.findAll();
	}
	
	public Optional<Leave> getid(long id) {

		return repository.findById(id);

	}

	public Leave update(Leave id) {

		return repository.save(id);

	}



	public void deleteall() {

		repository.deleteAll();

	}
	
	

}
