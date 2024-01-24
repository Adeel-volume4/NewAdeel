package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "process")
public class Process {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "current_duration")
	private Long currentDuration;
	
	@Column(name = "current_timer")
	private Date currentTimer;
	
	@Column(name = "last_duration")
	private Long lastDuration;
	
	@Column(name = "last_time")
	private Date lastTime;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "system_process_id")
	private Long systemProcessId;
	
	@Column(name = "user_id")
	private Long userId;

	@Override
	public String toString() {
		return "Process [id=" + id + ", currentDuration=" + currentDuration + ", currentTimer=" + currentTimer
				+ ", lastDuration=" + lastDuration + ", lastTime=" + lastTime + ", name=" + name + ", systemProcessId="
				+ systemProcessId + ", userId=" + userId + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getCurrentDuration() {
		return currentDuration;
	}

	public void setCurrentDuration(Long currentDuration) {
		this.currentDuration = currentDuration;
	}

	public Date getCurrentTimer() {
		return currentTimer;
	}

	public void setCurrentTimer(Date currentTimer) {
		this.currentTimer = currentTimer;
	}

	public Long getLastDuration() {
		return lastDuration;
	}

	public void setLastDuration(Long lastDuration) {
		this.lastDuration = lastDuration;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSystemProcessId() {
		return systemProcessId;
	}

	public void setSystemProcessId(Long systemProcessId) {
		this.systemProcessId = systemProcessId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
