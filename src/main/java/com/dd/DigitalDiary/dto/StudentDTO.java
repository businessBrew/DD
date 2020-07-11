package com.dd.DigitalDiary.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentDTO {
	
	private Integer studentId;
	private String studentName;
	private Integer rollNumber;
	private Date dateOfBirth;
	private String bloodGroup;
	private String gender;
	private String sartDate;
	private String className;
	private String sectionName;
	private String fatherName;
	private Integer fatherContactNo;
	private String motherName;
	private Integer motherContactNo;
	private String guardianName;
	private Integer guardianContactNo;
	private String currentAdress;
	private String permanentAdress;
	private Integer branchId;
	private String isActive;
	private String identityMark;
	private Integer updatedBy;
	private Date insertTime;
	private Date updatTeime;
	private String comment;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSartDate() {
		return sartDate;
	}
	public void setSartDate(String sartDate) {
		this.sartDate = sartDate;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Integer getFatherContactNo() {
		return fatherContactNo;
	}
	public void setFatherContactNo(Integer fatherContactNo) {
		this.fatherContactNo = fatherContactNo;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Integer getMotherContactNo() {
		return motherContactNo;
	}
	public void setMotherContactNo(Integer motherContactNo) {
		this.motherContactNo = motherContactNo;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public Integer getGuardianContactNo() {
		return guardianContactNo;
	}
	public void setGuardianContactNo(Integer guardianContactNo) {
		this.guardianContactNo = guardianContactNo;
	}
	public String getCurrentAdress() {
		return currentAdress;
	}
	public void setCurrentAdress(String currentAdress) {
		this.currentAdress = currentAdress;
	}
	public String getPermanentAdress() {
		return permanentAdress;
	}
	public void setPermanentAdress(String permanentAdress) {
		this.permanentAdress = permanentAdress;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIdentityMark() {
		return identityMark;
	}
	public void setIdentityMark(String identityMark) {
		this.identityMark = identityMark;
	}
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdatTeime() {
		return updatTeime;
	}
	public void setUpdatTeime(Date updatTeime) {
		this.updatTeime = updatTeime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
