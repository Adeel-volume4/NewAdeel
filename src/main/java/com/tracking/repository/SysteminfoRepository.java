package com.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracking.model.Systeminfo;
import com.tracking.model.Users;

@Repository
public interface SysteminfoRepository extends JpaRepository<Systeminfo, Long> {

}
