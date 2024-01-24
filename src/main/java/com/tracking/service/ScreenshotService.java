package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Screenshots;
import com.tracking.model.Systeminfo;
import com.tracking.repository.ScreenshotsRepository;
@Service
public class ScreenshotService {
	
	@Autowired
	ScreenshotsRepository screenshotsRepository;

	 @Cacheable("screenshot")
	  public List<Screenshots> findAll() {

	    return screenshotsRepository.findAll();
}
	 }
