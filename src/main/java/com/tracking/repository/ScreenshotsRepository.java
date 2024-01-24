package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Screenshots;

@Repository
public interface ScreenshotsRepository extends JpaRepository<Screenshots, Long> {

}
