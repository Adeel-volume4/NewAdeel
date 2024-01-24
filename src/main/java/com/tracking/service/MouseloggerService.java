package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Mouselogger;
import com.tracking.repository.MouseloggerRepository;
@Service
public class MouseloggerService {
	@Autowired
	MouseloggerRepository mouseLoggerRepository;

	 @Cacheable("mouse")
	  public List<Mouselogger> findAll() {

	    return mouseLoggerRepository.findAll();
}
}
