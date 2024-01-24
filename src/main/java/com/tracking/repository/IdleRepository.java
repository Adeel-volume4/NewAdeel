package com.tracking.repository;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracking.model.Idlelogger;

@Repository
public interface IdleRepository extends JpaRepository<Idlelogger,Log>{

	
	@Query("select p from Idlelogger p where p.userId = :userId and p.idle_start between :startDate and :currentDate ")
    public	List<Idlelogger> findByUserIdAndBetweenStartDateAndEndDate(@Param("userId") Integer userId,@Param("startDate") Date startDate,@Param("currentDate") Date currentDate);
	
	@Query("select p from Idlelogger p where p.userId = :userId and p.idle_start between :startDate and :currentDate ")
	public List<Idlelogger> findByUserIdAndBetweenStartDateAndEndDateForOneDay(@Param("userId") Integer userId,@Param("startDate") Date startDate,@Param("currentDate")Date currentDate);			
	
	

}
