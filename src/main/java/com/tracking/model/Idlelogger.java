package com.tracking.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="idlelogger")
public class Idlelogger {
	private static final long serialVersionUID = -8182636733511837607L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	
	@Column(name="duration")
    private Integer duration;
	
	@Column(name="idle_end")
	private Date idle_end;
	
	@Column(name="idle_start")
	private Date idle_start;

	
	@Column(name="user_id")
    private Integer userId;

	@Column(name="timzone")
    private String timzone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Date getIdle_end() {
		return idle_end;
	}

	public void setIdle_end(Date idle_end) {
		this.idle_end = idle_end;
	}

	public Date getIdle_start() {
		return idle_start;
	}

	public void setIdle_start(Date idle_start) {
		this.idle_start = idle_start;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTimezone() {
		return timzone;
	}

	public void setTimezone(String timezone) {
		this.timzone = timezone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Idlelogger(long id, Integer duration, Date idle_end, Date idle_start, Integer userId, String timzone) {
		super();
		this.id = id;
		this.duration = duration;
		this.idle_end = idle_end;
		this.idle_start = idle_start;
		this.userId = userId;
		this.timzone = timzone;
	}

	public Idlelogger() {
		super();
	}

	@Override
	public String toString() {
		return "Idlelogger [id=" + id + ", duration=" + duration + ", idle_end=" + idle_end + ", idle_start="
				+ idle_start + ", userId=" + userId + ", timezone=" + timzone + "]";
	}

	public Date getPunchIn() {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getPunchOut() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
