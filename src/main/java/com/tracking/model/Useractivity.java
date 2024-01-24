package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="useractivity")
public class Useractivity {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="time")
	private Long time;
	
	@Column(name="onlne")
    private Date online;
	
	@Column(name="offline")
    private Date offline;
	
	@Column(name="user_id")
    private Long userId;
	
	@Column(name="screenshots")
    private Long screenshot;

	@Override
	public String toString() {
		return "Useractivity [id=" + id + ", time=" + time + ", online=" + online + ", offline=" + offline + ", userId="
				+ userId + ", screenshot=" + screenshot + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Date getOnline() {
		return online;
	}

	public void setOnline(Date online) {
		this.online = online;
	}

	public Date getOffline() {
		return offline;
	}

	public void setOffline(Date offline) {
		this.offline = offline;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getScreenshot() {
		return screenshot;
	}

	public void setScreenshot(Long screenshot) {
		this.screenshot = screenshot;
	}
	
}
