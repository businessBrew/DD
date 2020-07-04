package com.dd.DigitalDiary.dao;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import com.dd.DigitalDiary.dto.UserDTO;

public interface IUsersMngDao {
	
	public Object getQuestionear() throws DataAccessException,SQLException;
	
	public Object registerNewUser(UserDTO userDto) throws DataAccessException,SQLException;
	

}
