package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="keyboardlogger")
public class Keyboardlogger {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="count")
    private Integer count;
	
	@Column(name="keymap")
    private String keymap;
	
	@Column(name="slot_end")
    private Date slotEnd;
    
    @Column(name="slot_start")
    private Date slotStart;
    
    @Column(name="user_id")
    private Long userId;
    
    @Column(name="hits")
    private Integer hits;

	@Override
	public String toString() {
		return "Keyboardlogger [id=" + id + ", count=" + count + ", keymap=" + keymap + ", slotEnd=" + slotEnd
				+ ", slotStart=" + slotStart + ", userId=" + userId + ", hits=" + hits + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getKeymap() {
		return keymap;
	}

	public void setKeymap(String keymap) {
		this.keymap = keymap;
	}

	public Date getSlotEnd() {
		return slotEnd;
	}

	public void setSlotEnd(Date slotEnd) {
		this.slotEnd = slotEnd;
	}

	public Date getSlotStart() {
		return slotStart;
	}

	public void setSlotStart(Date slotStart) {
		this.slotStart = slotStart;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}
    
    
}
