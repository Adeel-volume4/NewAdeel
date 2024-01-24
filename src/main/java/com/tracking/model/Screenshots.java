package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="screenshots")
public class Screenshots {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="date")
	 private Date date;
	
	@Column(name="directory")
    private String directory;
	
	@Column(name="user_id")
    private long userId;
    
    @Column(name="screenshot_time")
    private Long screenshotTime;
    
    @Column(name="for_admin")
    private int forAdmin;
    
	@Override
	public String toString() {
		return "Screenshots [id=" + id + ", date=" + date + ", directory=" + directory + ", userId=" + userId
				+ ", screenshotTime=" + screenshotTime + ", forAdmin=" + forAdmin + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Long getScreenshotTime() {
		return screenshotTime;
	}

	public void setScreenshotTime(Long screenshotTime) {
		this.screenshotTime = screenshotTime;
	}

	public int getForAdmin() {
		return forAdmin;
	}

	public void setForAdmin(int forAdmin) {
		this.forAdmin = forAdmin;
	}
    
}
