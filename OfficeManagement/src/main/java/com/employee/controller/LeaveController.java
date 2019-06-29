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

<<<<<<< HEAD
	@PostMapping("leave")
	public Leave putLeave(@RequestBody Leave leave) {
		return service.putLeave(leave);
=======
	@PostMapping("create")
	public Leave putLeave(@RequestBody Leave put) {
		return service.putLeave(put);
>>>>>>> f3325e30f87aa82d1bb9a541746feee99382988d
	}

	@GetMapping("all")
	public List<Leave> getAll() {
		return service.getAll();
	}

	@GetMapping("{id}")
	public Optional<Leave> getById(@PathVariable long id) {
		return service.getid(id);
	}

<<<<<<< HEAD
	@PutMapping("leave/{id}")
	public Leave update(@PathVariable long id, @RequestBody Leave leave) {
		return service.update(leave);
=======
	@PutMapping("{id}")
	public Leave update(@PathVariable long id, @RequestBody Leave update) {
		return service.update(update);
>>>>>>> f3325e30f87aa82d1bb9a541746feee99382988d

	}

	@DeleteMapping
	public void delete() {
		service.deleteall();
	}

}
