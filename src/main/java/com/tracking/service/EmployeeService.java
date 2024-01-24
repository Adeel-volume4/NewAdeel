package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tracking.model.Employee;
import com.tracking.model.Title;
import com.tracking.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	  EmployeeRepository redisRepository;

	  @Cacheable("employees")
	  public List<Employee> findAll() {

	    return redisRepository.findAll();
	  }


	  public Page<Title> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		return null;
	}
}
