package com.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tracking.model.Title;
import com.tracking.repository.TitleRepository;

@Service
public class TitleService {
	
	
	  @Autowired
	  TitleRepository redisRepository;

	  @Cacheable("titles")
	  public List<Title> findAll() {

	    return redisRepository.findAll();
	  }

//	  @Cacheable("titles")
//	  public List<Title> findByNameContaining(String name) {
//
//	    return redisRepository.findByNameContaining(name);
//	  }

	  public Page<Title> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		return null;
	}
	}


