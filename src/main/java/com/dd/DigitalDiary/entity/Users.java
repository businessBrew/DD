package com.dd.DigitalDiary.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="start_dt")
	private Date sartDate;
	
	@Column(name="end_dt")
	private Date endDate;
	
	@Column(name="upd_id")
	private String updateId;
	
	@Column(name="active_ind")
	private String isActive;
	
	@Column(name="ins_tmstmp")
	private Date lastaccessed;
	
	@Column(name="upd_tmstmp")
	private Date lastUpdated;
	
	@ManyToMany
	@JoinTable(name="USER_ROLES",joinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"),inverseJoinColumns = @JoinColumn(name="role_cd",referencedColumnName="role_cd"))
	private Collection<Roles> roles;
	
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
	

}
 