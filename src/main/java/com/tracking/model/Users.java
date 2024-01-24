package com.tracking.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	private static final long serialVersionUID = -8182636733511837607L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="department_id")
    private Integer departmentId;
	
	@Column(name="full_name")
    private String fullName;
	
	@Column(name="password")
    private String password;
	
	@Column(name="user_name")
    private String userName;
	

	@Column(name="is_exempted")
	private Boolean isExempted;
	
	@Column(name="exempted_reason")
    private String exemptedReason;
	
	@Column(name="role_id")
    private Long roleId;
	
	@Column(name="timezone")
    private String timezone;
	
	@Column(name="version")
    private String version;
	
	@Column(name="last_connect_login")
    private Date lastConnectLogin;

	@Column(name="tracker_login_id")
	private String trackerLoginId;
	
	@Column(name="active_task")
    private String activeTask;
	
	@Column(name="active_task_timestamp")
    private Date activeTaskTimestamp;
	
	@Column(name="deleted")
    private Boolean deleted;
	
	@Column(name="screenshot_enabled")
    private Boolean screenshotEnabled;
    
	
	@Column(name="click")
	private Boolean click;
	
	@Column(name="isblocked")
    private String isblocked;
	
	@Column(name="emp_id")
    private Integer empId;
	
	
	
	

	@Override
	public String toString() {
		return "Users [id=" + id + ", departmentId=" + departmentId + ", fullName=" + fullName + ", password="
				+ password + ", userName=" + userName + ", isExempted=" + isExempted + ", exemptedReason="
				+ exemptedReason + ", roleId=" + roleId + ", timezone=" + timezone + ", version=" + version
				+ ", lastConnectLogin=" + lastConnectLogin + ", trackerLoginId=" + trackerLoginId + ", activeTask="
				+ activeTask + ", activeTaskTimestamp=" + activeTaskTimestamp + ", deleted=" + deleted
				+ ", screenshotEnabled=" + screenshotEnabled + ", click=" + click + ", isBlocked=" + isblocked
				+ ", empId=" + empId + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getIsExempted() {
		return isExempted;
	}

	public void setIsExempted(Boolean isExempted) {
		this.isExempted = isExempted;
	}

	public String getExemptedReason() {
		return exemptedReason;
	}

	public void setExemptedReason(String exemptedReason) {
		this.exemptedReason = exemptedReason;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getLastConnectLogin() {
		return lastConnectLogin;
	}

	public void setLastConnectLogin(Date lastConnectLogin) {
		this.lastConnectLogin = lastConnectLogin;
	}

	public String getTrackerLoginId() {
		return trackerLoginId;
	}

	public void setTrackerLoginId(String trackerLoginId) {
		this.trackerLoginId = trackerLoginId;
	}

	public String getActiveTask() {
		return activeTask;
	}

	public void setActiveTask(String activeTask) {
		this.activeTask = activeTask;
	}

	public Date getActiveTaskTimestamp() {
		return activeTaskTimestamp;
	}

	public void setActiveTaskTimestamp(Date activeTaskTimestamp) {
		this.activeTaskTimestamp = activeTaskTimestamp;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getScreenshotEnabled() {
		return screenshotEnabled;
	}

	public void setScreenshotEnabled(Boolean screenshotEnabled) {
		this.screenshotEnabled = screenshotEnabled;
	}

	public Boolean getClick() {
		return click;
	}

	public void setClick(Boolean click) {
		this.click = click;
	}

	public String isBlocked() {
		return isblocked;
	}

	public void setBlocked(String isBlocked) {
		this.isblocked = isBlocked;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Users(long id, Integer departmentId, String fullName, String password, String userName, Boolean isExempted,
			String exemptedReason, Long roleId, String timezone, String version, Date lastConnectLogin,
			String trackerLoginId, String activeTask, Date activeTaskTimestamp, Boolean deleted,
			Boolean screenshotEnabled, Boolean click, String isblocked, Integer empId) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.fullName = fullName;
		this.password = password;
		this.userName = userName;
		this.isExempted = isExempted;
		this.exemptedReason = exemptedReason;
		this.roleId = roleId;
		this.timezone = timezone;
		this.version = version;
		this.lastConnectLogin = lastConnectLogin;
		this.trackerLoginId = trackerLoginId;
		this.activeTask = activeTask;
		this.activeTaskTimestamp = activeTaskTimestamp;
		this.deleted = deleted;
		this.screenshotEnabled = screenshotEnabled;
		this.click = click;
		this.isblocked = isblocked;
		this.empId = empId;
	}

	public Users() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
