package com.tracking.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracking.dto.DateUtilities;
import com.tracking.dto.OneDayDto;
import com.tracking.model.Idlelogger;
import com.tracking.model.Screenshots;
import com.tracking.repository.IdleRepository;

@Service
public class IdleloggerService {

	@Autowired
	IdleRepository idleRepository;

	public List<Idlelogger> findAll() {
		// TODO Auto-generated method stub
		return idleRepository.findAll();
	}

//	public List<UserDto> GetAllIdleLoggerDetails(Integer userId) {
//
//		Date currentDate = new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(currentDate);
//		cal.add(Calendar.DAY_OF_MONTH, -7);
//		Date startDate = cal.getTime();
//		
//		
//		
//	

	
	
//		List<Idlelogger> idleDetails = idleRepository.findByUserIdAndBetweenStartDateAndEndDate(userId, startDate,
//				currentDate);

	
	
	
	public OneDayDto GetUserOneDayData(Integer userId) {

		Date currentDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		Date startDate = cal.getTime();

		List<Idlelogger> idleTimeDetails = idleRepository.findByUserIdAndBetweenStartDateAndEndDateForOneDay(userId,
				startDate, currentDate);
		
		Integer ScheduleTime=8;
		long Logged_in_Time = 0;
		long idletime = 0;
		long ActiveTime = 0;
		String ActiveLogIn=null;
		
		String IdleiTme=null;
		
		String Active=null;
		
		Integer ActiveCharts = null;
		Integer score = null;
		Integer rank = null;
		Integer timeline =null;
		Screenshots screensShots = null;

		for (Idlelogger punch2 : idleTimeDetails) {
			
			Date idleStart=punch2.getIdle_start();
			
			Date idleend=punch2.getIdle_end();
			
			
			if(idleStart !=null && idleend !=null) {
				
				long DefferenceInmillies=idleend.getTime() - idleStart.getTime();
				
				Logged_in_Time = Logged_in_Time + DefferenceInmillies;
				
				
				long millis = Logged_in_Time;
				ActiveLogIn = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
						TimeUnit.MILLISECONDS.toMinutes(millis)
								- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
						TimeUnit.MILLISECONDS.toSeconds(millis)
								- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
				System.out.println(ActiveLogIn);
				
			}
				
			
		}
		
		List<Idlelogger> idleDetails = idleRepository.findByUserIdAndBetweenStartDateAndEndDate(userId, startDate,
				currentDate);

		for (Idlelogger punch1 : idleDetails) {

			Date idleStart1 = punch1.getIdle_start();

			Date idleend1 = punch1.getIdle_end();

			if (idleStart1 != null && idleend1 != null) {

				long DefferenceInmillies=idleend1.getTime()-idleStart1.getTime();

				idletime = idletime + DefferenceInmillies;

				long millis = idletime;
				IdleiTme = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
						TimeUnit.MILLISECONDS.toMinutes(millis)
								- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
						TimeUnit.MILLISECONDS.toSeconds(millis)
								- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
				  System.out.println(IdleiTme);
			}

		}
		
	
		
		

		ActiveTime = Logged_in_Time - idletime;
		
		Active = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(ActiveTime),
				TimeUnit.MILLISECONDS.toMinutes(ActiveTime)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(ActiveTime)),
				TimeUnit.MILLISECONDS.toSeconds(ActiveTime)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(ActiveTime)));
		System.out.println(Active);
		
		
	

		OneDayDto one = new OneDayDto();
		
		one.setDate(DateUtilities.convertDateToString(startDate) );
		one.setLoginTime(ActiveLogIn);
		one.setActivetime(Active);
		one.setIdletime(IdleiTme);

		return one;
		
     

}
	}
