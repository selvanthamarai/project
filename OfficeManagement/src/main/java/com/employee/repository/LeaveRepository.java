package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long> {

}
