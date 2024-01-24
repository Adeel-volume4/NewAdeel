package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Keywords;

@Repository
public interface KeywordsRepository extends JpaRepository<Keywords, Long> {

}
