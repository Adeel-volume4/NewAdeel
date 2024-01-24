package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userping")
public class Userping {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="ping_time")
	 private Date pingTime;
	
	@Column(name="user_id")
    private Long userId;

	@Override
	public String toString() {
		return "Userping [id=" + id + ", pingTime=" + pingTime + ", userId=" + userId + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPingTime() {
		return pingTime;
	}

	public void setPingTime(Date pingTime) {
		this.pingTime = pingTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
