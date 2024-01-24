package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Userping;
import com.tracking.repository.UserpingRepository;
@Service
public class UserpingService {
	@Autowired
	UserpingRepository userPingRepository;
	
	 @Cacheable("userping")
	  public List<Userping> findAll() {

	    return userPingRepository.findAll();
	  }
}
