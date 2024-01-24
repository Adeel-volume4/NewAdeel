package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Systeminfo;
import com.tracking.model.Useractivity;
import com.tracking.repository.SysteminfoRepository;
@Service
public class SysteminfoService {
	
	@Autowired
	SysteminfoRepository systemInfoRepository;

	 @Cacheable("system")
	  public List<Systeminfo> findAll() {

	    return systemInfoRepository.findAll();
}
}