package com.dd.DigitalDiary.dao;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import com.dd.DigitalDiary.dto.StudentDTO;

public interface IDigidiaryDao {
	
	public Object saveStudentInfo(StudentDTO student) throws DataAccessException,SQLException;

}
