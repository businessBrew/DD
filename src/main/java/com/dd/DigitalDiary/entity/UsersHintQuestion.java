package com.dd.DigitalDiary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_hint_questions")
public class UsersHintQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	
	@Column(name = "user_id")
	Integer userId;
	
	@Column(name = "question_id_1")
	Integer questionId1;
	
	@Column(name = "user_id_2")
	Integer questionId2;
	
	@Column(name = "answer_1")
	String answer1;

	@Column(name = "answer_2")
	String answer2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQuestionId1() {
		return questionId1;
	}

	public void setQuestionId1(Integer questionId1) {
		this.questionId1 = questionId1;
	}

	public Integer getQuestionId2() {
		return questionId2;
	}

	public void setQuestionId2(Integer questionId2) {
		this.questionId2 = questionId2;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
}
