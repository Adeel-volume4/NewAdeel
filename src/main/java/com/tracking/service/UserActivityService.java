package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tracking.model.Punch;
import com.tracking.model.Title;
import com.tracking.model.Useractivity;
import com.tracking.repository.UserActivityRepository;

@Service
public class UserActivityService {
	@Autowired
	  UserActivityRepository userActivityRepository;

	  @Cacheable("activity")
	  public List<Useractivity> findAll() {

	    return userActivityRepository.findAll();
	  }

}
