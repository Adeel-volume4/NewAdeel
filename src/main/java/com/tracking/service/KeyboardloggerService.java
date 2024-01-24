package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Keyboardlogger;
import com.tracking.repository.KeyboardloggerRepository;
@Service
public class KeyboardloggerService {
	@Autowired
	KeyboardloggerRepository keybordLoggerRepository;

	 @Cacheable("process")
	  public List<Keyboardlogger> findAll() {

	    return keybordLoggerRepository.findAll();
}
}
