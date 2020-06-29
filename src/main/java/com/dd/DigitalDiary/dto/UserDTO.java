package com.dd.DigitalDiary.dto;

import java.sql.Date;


public class UserDTO {
	
	private Integer userId;
	private String userName;
	private String password;
	private Date sartDate;
	private Date endDate;
	private String updateId;
	private String isActive;
	private Date lastaccessed;
	private Date lastUpdated;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getSartDate() {
		return sartDate;
	}
	public void setSartDate(Date sartDate) {
		this.sartDate = sartDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public Date getLastaccessed() {
		return lastaccessed;
	}
	public void setLastaccessed(Date lastaccessed) {
		this.lastaccessed = lastaccessed;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
}