package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Role;
import com.tracking.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;

	 @Cacheable("role")
	  public List<Role> findAll() {

	    return roleRepository.findAll();
}
}
