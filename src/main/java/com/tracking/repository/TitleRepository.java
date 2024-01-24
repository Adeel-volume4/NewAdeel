package com.tracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Title;


@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

//	  List<Title> findByNameContaining(String name);
	}
