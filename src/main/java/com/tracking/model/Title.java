package com.tracking.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "title")
public class Title implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "current_duration")
	private Long currentDuration;

	@Column(name = "current_timer")
	private Date currentTimer;

	@Column(name = "last_duration")
	private Long lastDuration;

	@Column(name = "last_time")
	private Date lastTime;

	@Column(name = "title")
	private String title;

	@Column(name = "process_id")
	private Long processId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "process_name")
	private String processName;

	@Column(name = "last_modified_time")
	private Date lastModifiedTime;

	@Column(name = "modification_date")
	private Date modificationDate;

	public Title() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", currentDuration=" + currentDuration + ", currentTimer=" + currentTimer
				+ ", lastDuration=" + lastDuration + ", lastTime=" + lastTime + ", title=" + title + ", processId="
				+ processId + ", userId=" + userId + ", processName=" + processName + ", lastModifiedTime="
				+ lastModifiedTime + ", modificationDate=" + modificationDate + "]";
	}
	
	
}
