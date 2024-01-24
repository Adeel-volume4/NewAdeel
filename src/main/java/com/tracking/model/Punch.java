package com.tracking.model;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="punch")
public class Punch {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="duration")
	 private Integer duration;
	
	
	@Column(name="punch_in")
    private Timestamp punchIn;
	
	
	@Column(name="punch_out")
    private Timestamp punchOut;
	
	@Column(name="user_id")
    private Long userId;
	
	@Column(name="punch")
    private Date punch;
	
	@Column(name="punch_type")
    private Integer punchType;

	@Override
	public String toString() {
		return "Punch [id=" + id + ", duration=" + duration + ", punchIn=" + punchIn + ", punchOut=" + punchOut
				+ ", userId=" + userId + ", punch=" + punch + ", punchType=" + punchType + "]";
	}

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

	public Timestamp getPunchIn() {
		return punchIn;
	}

	public void setPunchIn(Timestamp punchIn) {
		this.punchIn = punchIn;
	}

	public Timestamp getPunchOut() {
		return punchOut;
	}

	public void setPunchOut(Timestamp punchOut) {
		this.punchOut = punchOut;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getPunch() {
		return punch;
	}

	public void setPunch(Date punch) {
		this.punch = punch;
	}

	public Integer getPunchType() {
		return punchType;
	}

	public void setPunchType(Integer punchType) {
		this.punchType = punchType;
	}
	
	
}
