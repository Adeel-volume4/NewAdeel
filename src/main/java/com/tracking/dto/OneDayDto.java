package com.tracking.dto;

import java.util.Date;

import com.tracking.model.Screenshots;

public class OneDayDto {
	
	
	
	private String date;
	
	
	private String loginTime;
	
	private String idletime;
	
	private String activetime;
	

	
	private Integer activecharts;
	
	
	private Integer score;
	
	
	private Integer rank;
	
	
	private Integer timeline;
	
	
	private Screenshots screensShots;


	private Integer WorkSchedule;


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLoginTime() {
		return loginTime;
	}


	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}


	public String getIdletime() {
		return idletime;
	}


	public void setIdletime(String idletime) {
		this.idletime = idletime;
	}


	public String getActivetime() {
		return activetime;
	}


	public void setActivetime(String activetime) {
		this.activetime = activetime;
	}


	public Integer getActivecharts() {
		return activecharts;
	}


	public void setActivecharts(Integer activecharts) {
		this.activecharts = activecharts;
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


	public Integer getWorkSchedule() {
		return WorkSchedule;
	}


	public void setWorkSchedule(Integer workSchedule) {
		WorkSchedule = workSchedule;
	}


	public OneDayDto(String date, String loginTime, String idletime, String activetime, Integer activecharts,
			Integer score, Integer rank, Integer timeline, Screenshots screensShots, Integer workSchedule) {
		super();
		this.date = date;
		this.loginTime = loginTime;
		this.idletime = idletime;
		this.activetime = activetime;
		this.activecharts = activecharts;
		this.score = score;
		this.rank = rank;
		this.timeline = timeline;
		this.screensShots = screensShots;
		WorkSchedule = workSchedule;
	}


	public OneDayDto() {
		super();
	}


	@Override
	public String toString() {
		return "OneDayDto [date=" + date + ", loginTime=" + loginTime + ", idletime=" + idletime + ", activetime="
				+ activetime + ", activecharts=" + activecharts + ", score=" + score + ", rank=" + rank + ", timeline="
				+ timeline + ", screensShots=" + screensShots + ", WorkSchedule=" + WorkSchedule + "]";
	}




	

	
	

}
