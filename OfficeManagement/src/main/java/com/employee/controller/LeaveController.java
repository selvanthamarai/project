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

import com.employee.model.Leave;
import com.employee.service.impl.LeaveService;

@RestController
@RequestMapping("leave")
public class LeaveController {
	@Autowired
	private LeaveService service;
 
	@PostMapping("create")
	public Leave putLeave(@RequestBody Leave put) {
		return service.putLeave(put);
	}

	@GetMapping("all")
	public List<Leave> getAll() {
		return service.getAll();
	}

	@GetMapping("{id}")
	public Optional<Leave> getById(@PathVariable long id) {
		return service.getid(id);
	}

 
	@PutMapping("{id}")
	public Leave update(@PathVariable long id, @RequestBody Leave update) {
		return service.update(update);
	}

	@DeleteMapping
	public void delete() {
		service.deleteall();
	}

}
