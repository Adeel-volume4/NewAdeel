package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Process;
import com.tracking.repository.ProcessRepository;
@Service
public class ProcessService {
	@Autowired
	ProcessRepository processRepository;

	 @Cacheable("process")
	  public List<Process> findAll() {

	    return processRepository.findAll();
}
}
