package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Keyboardlogger;
import com.tracking.model.Users;

@Repository
public interface KeyboardloggerRepository extends JpaRepository<Keyboardlogger, Long> {
}
