package com.dd.DigitalDiary.dao.impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dd.DigitalDiary.dao.IUsersMngDao;
import com.dd.DigitalDiary.repo.HintQuestionRepository;


@Repository
public class UsersMngDaoImpl implements IUsersMngDao{
	
	private static final Logger logger = LoggerFactory.getLogger(UsersMngDaoImpl.class);
	
	@Autowired
	HintQuestionRepository questionRepository;
	
	@Override
	public Object getQuestionear() throws DataAccessException,SQLException {
		// TODO Auto-generated method stub
		logger.info("start : getQuestionear UsersMngDaoImpl ");
		Object obj = questionRepository.findAll();
		logger.info("end : getQuestionear UsersMngDaoImpl ");
		return obj;
	}

}
