package com.dd.DigitalDiary.dao;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

public interface IUsersMngDao {
	
	public Object getQuestionear() throws DataAccessException,SQLException;

}
