package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long> {

}
