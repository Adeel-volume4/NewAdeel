package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Keywords;
import com.tracking.repository.KeywordsRepository;
@Service
public class Keyword {
	@Autowired
	KeywordsRepository keywordsRepository;

	 @Cacheable("keyword")
	  public List<Keywords> findAll() {

	    return keywordsRepository.findAll();
}
}