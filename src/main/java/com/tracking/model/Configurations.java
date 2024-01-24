package com.tracking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "configurations")
public class Configurations {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="idle_timer")
	private Integer idleTimer;
	
	@Column(name="version")
	private String version;
	
	@Column(name="idle_timer_logout")
	private Integer idleTimerLogout;
	
	@Column(name="base_url")
	private String baseUrl;
	
	@Column(name="screenshot_timer")
	private Integer screenshotTimer;

	@Override
	public String toString() {
		return "Configurations [id=" + id + ", idleTimer=" + idleTimer + ", version=" + version + ", idleTimerLogout="
				+ idleTimerLogout + ", baseUrl=" + baseUrl + ", screenshotTimer=" + screenshotTimer + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getIdleTimer() {
		return idleTimer;
	}

	public void setIdleTimer(Integer idleTimer) {
		this.idleTimer = idleTimer;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getIdleTimerLogout() {
		return idleTimerLogout;
	}

	public void setIdleTimerLogout(Integer idleTimerLogout) {
		this.idleTimerLogout = idleTimerLogout;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Integer getScreenshotTimer() {
		return screenshotTimer;
	}

	public void setScreenshotTimer(Integer screenshotTimer) {
		this.screenshotTimer = screenshotTimer;
	}
	
	
}
