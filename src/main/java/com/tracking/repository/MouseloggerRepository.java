package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Mouselogger;

@Repository
public interface MouseloggerRepository extends JpaRepository<Mouselogger, Long> {
}
