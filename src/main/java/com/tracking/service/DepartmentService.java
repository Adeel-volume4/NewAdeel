package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Department;
import com.tracking.repository.DepartmentRepository;
@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	
	 @Cacheable("department")
	  public List<Department> findAll() {

	    return departmentRepository.findAll();
	  }

}
