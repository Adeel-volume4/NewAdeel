package com.tracking.dto;

import java.sql.Date;

import com.tracking.model.Screenshots;

public class UserDto {

	private String fullName;

	private Integer WorkSchedule;
	
	
	private String activeLogIn;
	
	private String idleTime;
	
	private String activeTime;
	
	
	private long logged_in_Time;
	
	private Date punchIn;
	
	private Date punchOut;

	private long idle_time;

	private long active_time;

	private Integer activity_chart;

	private Integer score;
	
	private Integer rank;
	
	private Integer timeline;

	private Screenshots screensShots;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getWorkSchedule() {
		return WorkSchedule;
	}

	public void setWorkSchedule(Integer workSchedule) {
		WorkSchedule = workSchedule;
	}

	public String getActiveLogIn() {
		return activeLogIn;
	}

	public void setActiveLogIn(String activeLogIn) {
		this.activeLogIn = activeLogIn;
	}

	public String getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(String idleTime) {
		this.idleTime = idleTime;
	}

	public String getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public long getLogged_in_Time() {
		return logged_in_Time;
	}

	public void setLogged_in_Time(long logged_in_Time) {
		this.logged_in_Time = logged_in_Time;
	}

	public Date getPunchIn() {
		return punchIn;
	}

	public void setPunchIn(Date punchIn) {
		this.punchIn = punchIn;
	}

	public Date getPunchOut() {
		return punchOut;
	}

	public void setPunchOut(Date punchOut) {
		this.punchOut = punchOut;
	}

	public long getIdle_time() {
		return idle_time;
	}

	public void setIdle_time(long idle_time) {
		this.idle_time = idle_time;
	}

	public long getActive_time() {
		return active_time;
	}

	public void setActive_time(long active_time) {
		this.active_time = active_time;
	}

	public Integer getActivity_chart() {
		return activity_chart;
	}

	public void setActivity_chart(Integer activity_chart) {
		this.activity_chart = activity_chart;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getTimeline() {
		return timeline;
	}

	public void setTimeline(Integer timeline) {
		this.timeline = timeline;
	}

	public Screenshots getScreensShots() {
		return screensShots;
	}

	public void setScreensShots(Screenshots screensShots) {
		this.screensShots = screensShots;
	}

	public UserDto(String fullName, Integer workSchedule, String activeLogIn, String idleTime, String activeTime,
			long logged_in_Time, Date punchIn, Date punchOut, long idle_time, long active_time, Integer activity_chart,
			Integer score, Integer rank, Integer timeline, Screenshots screensShots) {
		super();
		this.fullName = fullName;
		WorkSchedule = workSchedule;
		this.activeLogIn = activeLogIn;
		this.idleTime = idleTime;
		this.activeTime = activeTime;
		this.logged_in_Time = logged_in_Time;
		this.punchIn = punchIn;
		this.punchOut = punchOut;
		this.idle_time = idle_time;
		this.active_time = active_time;
		this.activity_chart = activity_chart;
		this.score = score;
		this.rank = rank;
		this.timeline = timeline;
		this.screensShots = screensShots;
	}

	public UserDto() {
		super();
	}

	

	

	
	
	
	
	
}
