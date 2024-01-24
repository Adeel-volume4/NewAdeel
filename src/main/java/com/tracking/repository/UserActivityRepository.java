package com.tracking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracking.model.Useractivity;
import com.tracking.model.Users;

import io.lettuce.core.dynamic.annotation.Param;

public interface UserActivityRepository extends JpaRepository<Useractivity, Long> {
	
}
