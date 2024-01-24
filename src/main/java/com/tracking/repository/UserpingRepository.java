package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Userping;

@Repository
public interface UserpingRepository extends JpaRepository<Userping, Long> {

}
