package com.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tracking.model.Title;
import com.tracking.model.Users;
import com.tracking.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	  UserRepository userRepository;

	  @Cacheable("users")
	  public List<Users> findAll() {

	    return userRepository.findAll();
	  }

	  public Page<Title> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		return null;
	}

	public List<Users> getAllPosts() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

//	public Iterable<Title> findByName(String name) {
//		// TODO Auto-generated method stub
//		return userRepository.findById;
//	}
//
//	public Iterable<Title> findById(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public void findById(Users user) {
//		
//		return userRepository.findById(user);
//		
//	}
//
//	
	

	}