package com.tracking.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tracking.dto.UserDto;
import com.tracking.model.Idlelogger;
import com.tracking.model.Punch;
import com.tracking.model.Users;
import com.tracking.repository.IdleRepository;
import com.tracking.repository.PunchRepository;
import com.tracking.repository.UserRepository;

@Service
public class PunchService {

	@Autowired
	IdleRepository idleRepository;

	@Autowired
	PunchRepository punchRepository;

	@Autowired
	private UserRepository userRepository;

	@Cacheable("punch")
	public List<Punch> findAll() {

		return punchRepository.findAll();
	}

	public UserDto GetAllDetails(Integer userId) {

		Date currentDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		Date startDate = cal.getTime();

		List<Punch> punchDetails = punchRepository.findByUserIdAndBetweenStartDateAndEndDate(userId, startDate,
				currentDate);

		Users user = userRepository.findById(userId.longValue()).get();
		Integer workchedule = 40;
		long logintime = 0;

		long Idletime = 0;
		long activetime = 0;

		Integer activityCharts = null;
		Integer score = null;
		Integer rank = null;
		Integer timeline = null;
		String ActiveLogIn = null;
		String IdleTime = null;
		String activeTimeString = null;
		for (Punch punch : punchDetails) {

			Date punchIn = punch.getPunchIn();
			Date punchOut = punch.getPunchOut();

			if (punchIn != null && punchOut != null) {

				long differenceInMillis = punchOut.getTime() - punchIn.getTime();

				logintime = logintime + differenceInMillis;

				long millis = logintime;
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

			Date idleStart = punch1.getIdle_start();

			Date idleend = punch1.getIdle_end();

			if (idleStart != null && idleend != null) {

				long IdleTimeDefference = idleend.getTime() - idleStart.getTime();

				Idletime = Idletime + IdleTimeDefference;

				long millis = Idletime;
				IdleTime = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
						TimeUnit.MILLISECONDS.toMinutes(millis)
								- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
						TimeUnit.MILLISECONDS.toSeconds(millis)
								- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));

			}

		}

		activetime = logintime - Idletime;
		activeTimeString = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(activetime),
				TimeUnit.MILLISECONDS.toMinutes(activetime)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(activetime)),
				TimeUnit.MILLISECONDS.toSeconds(activetime)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(activetime)));

		UserDto userDto = new UserDto();
		userDto.setFullName(user.getFullName());
		userDto.setWorkSchedule(workchedule);
//		userDto.setLogged_in_Time(logintime);
//		userDto.setIdle_time(Idletime);
		userDto.setIdleTime(IdleTime);
//		userDto.setActive_time(activetime);
		userDto.setActiveLogIn(ActiveLogIn);
		userDto.setActivity_chart(activityCharts);
		userDto.setRank(rank);
		userDto.setScore(score);
		userDto.setTimeline(timeline);
		userDto.setActiveLogIn(ActiveLogIn);
		userDto.setActiveTime(activeTimeString);

		return userDto;

	}

	private Date getPunchOut() {
		// TODO Auto-generated method stub
		return null;
	}

//	public OneDayDto GetUserOneDayData(Integer userId) {
//
//		Date currentDate = new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(currentDate);
//		cal.add(Calendar.DAY_OF_MONTH, -1);
//		Date startDate = cal.getTime();
//
//		List<Idlelogger> idleTimeDetails = idleRepository.findByUserIdAndBetweenStartDateAndEndDateForOneDay(userId,
//				startDate, currentDate);
//
//		Integer Logged_in_Time = 0;
//		Integer idleTime = 0;
//		Integer ActiveTime = 0;
//		Integer ActiveCharts = 35;
//		Integer score = 90;
//		Integer rank = 4;
//		Integer timeline = 45;
//		Screenshots screensShots = null;
//
//		for (Idlelogger punch2 : idleTimeDetails) {
//
//			idleTime = idleTime + punch2.getDuration();
//		}
//
//		ActiveTime = ActiveTime - idleTime;
//
//		OneDayDto one = new OneDayDto();
//		one.setDate(startDate);
//		one.setLogged_in_Time(Logged_in_Time);
//		one.setIdleTime(idleTime);
//		one.setActiveTime(ActiveTime);
//		one.setActivecharts(ActiveCharts);
//		one.setScore(score);
//		one.setRank(rank);
//		one.setTimeline(timeline);
//		one.setScreensShots(screensShots);
//
//		return one;
//
//	}

//	public UserDto GetAllDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}