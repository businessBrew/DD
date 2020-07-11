package com.dd.DigitalDiary.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stu_id")
	private Integer studentId;
	
	@Column(name="stu_name")
	private String studentName;
	
	@Column(name="roll_no")
	private String rollNumber;
	
	@Column(name="dob")
	private Date dateOfBirth;
	
	@Column(name="blood_grp")
	private String bloodGroup;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="class")
	private String className;
	
	@Column(name="section")
	private String sectionName;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="father_mob")
	private Integer fatherContactNo;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="mother_mob")
	private Integer motherContactNo;
	
	@Column(name="guardian_name")
	private String guardianName;
	
	@Column(name="guardian_mob")
	private Integer guardianContactNo;
	
	@Column(name="comm_address")
	private String currentAdress;
	
	@Column(name="permanent_address",insertable = false, updatable = false)
	private String permanentAdress;
	
	@Column(name="branch_id")
	private Integer branchId;
	
	@Column(name="active_ind")
	private String isActive;
	
	@Column(name="identity_mark")
	private String identityMark;
	
	@Column(name="upd_id")
	private String updatedBy;
	
	@Column(name="ins_tmstmp")
	private Date insertTime;
	
	@Column(name="upd_tmstmp")
	private Date updatTeime;
	
	@Column(name="comment")
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

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	

}
