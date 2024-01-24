package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	  List<Title> findByNameContaining(String name);
	}

