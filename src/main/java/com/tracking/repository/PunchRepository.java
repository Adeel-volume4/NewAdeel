package com.tracking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracking.model.Punch;

@Repository
public interface PunchRepository extends JpaRepository<Punch, Long> {
	
	@Query("select p from Punch p where p.userId =:userId and p.punch between :startDate and :currentDate ")
	public List<Punch> findByUserIdAndBetweenStartDateAndEndDate(@Param("userId") Integer userId,@Param("startDate") Date startDate,@Param("currentDate") Date currentDate);

	
//	@Query("select p from Punch p where p.userId =:userId and p.punch between :startDate and :currentDate")
//	public List<Punch> findByUserIdAndBetweenStartDateAndEndDateForOneDay(@Param("userId")Integer userId,@Param("startDate") Date startDate,@Param("currentDate")
//			Date currentDate);
//		
//	
	
	
}

