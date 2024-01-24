package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Configurations;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configurations, Long> {
}
