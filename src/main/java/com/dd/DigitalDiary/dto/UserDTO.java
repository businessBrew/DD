package com.dd.DigitalDiary.dto;

import java.sql.Date;
import java.util.Collection;

import com.dd.DigitalDiary.entity.Roles;


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
	private Collection<Roles> roles;
	private String jwtToken;
	private HintQuestionDTO hintQuestionDTO;
	
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
	public Collection<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Roles> roles) {
		this.roles = roles;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public HintQuestionDTO getHintQuestionDTO() {
		return hintQuestionDTO;
	}
	public void setHintQuestionDTO(HintQuestionDTO hintQuestionDTO) {
		this.hintQuestionDTO = hintQuestionDTO;
	}
	
	
}