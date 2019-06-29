package com.employee.services;

import java.util.List;
import java.util.Optional;

import com.employee.model.Leave;

public interface LeaveService {

	
	public Leave putLeave(Leave  leave);
	
	public List<Leave> getAll();
	
	public Optional<Leave> getid(long id);
	
	public Leave update(Leave leave);
	
	public void deleteall();
	
	
	
}
