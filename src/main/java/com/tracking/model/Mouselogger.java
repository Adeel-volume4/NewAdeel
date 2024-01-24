package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mouselogger")
public class Mouselogger {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="duration")
	   private Long duration;
	
	@Column(name="log_end")
	private Date logEnd;
	    
	@Column(name="log_start")
	private Date logStart;
	    	    
	    @Column(name="user_id")
	    private Long userId;

		@Override
		public String toString() {
			return "Mouselogger [id=" + id + ", duration=" + duration + ", logEnd=" + logEnd + ", logStart=" + logStart
					+ ", userId=" + userId + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getDuration() {
			return duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Date getLogEnd() {
			return logEnd;
		}

		public void setLogEnd(Date logEnd) {
			this.logEnd = logEnd;
		}

		public Date getLogStart() {
			return logStart;
		}

		public void setLogStart(Date logStart) {
			this.logStart = logStart;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	    
}
