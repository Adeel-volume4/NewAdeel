package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.tracking.model.Category;
import com.tracking.repository.CategoryRepository;

public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	 @Cacheable("category")
	  public List<Category> findAll() {

	    return categoryRepository.findAll();
	  }
}
