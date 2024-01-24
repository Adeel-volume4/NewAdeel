package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Configurations;
import com.tracking.repository.ConfigurationRepository;
@Service
public class ConfigurationService {
	@Autowired
	ConfigurationRepository configurationRepository;
	
	 @Cacheable("configuration")
	  public List<Configurations> findAll() {

	    return configurationRepository.findAll();
	  }
	}
