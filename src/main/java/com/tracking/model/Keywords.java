package com.tracking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "keywords")
public class Keywords {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "keyword_name")
	private String keywordName;

	@Column(name = "is_productive")
	private Boolean isProductive;

	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "department_id")
	private Long departmentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeywordName() {
		return keywordName;
	}

	public void setKeywordName(String keywordName) {
		this.keywordName = keywordName;
	}

	public Boolean getIsProductive() {
		return isProductive;
	}

	public void setIsProductive(Boolean isProductive) {
		this.isProductive = isProductive;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Keywords [id=" + id + ", keywordName=" + keywordName + ", isProductive=" + isProductive
				+ ", categoryId=" + categoryId + ", departmentId=" + departmentId + "]";
	}
	
	
}
