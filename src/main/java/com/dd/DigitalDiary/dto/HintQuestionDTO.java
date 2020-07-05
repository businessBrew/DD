package com.dd.DigitalDiary.dto;

public class HintQuestionDTO {
	
	Integer id;
	Integer questionId1;
	Integer questionId2;
	String answer1;
	String answer2;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
