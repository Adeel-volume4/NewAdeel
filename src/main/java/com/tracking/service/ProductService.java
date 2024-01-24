package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.model.Product;
import com.tracking.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	 @Cacheable("product")
	  public List<Product> findAll() {

	    return productRepository.findAll();
}
}
