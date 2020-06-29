package com.dd.DigitalDiary.service.Impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dao.IUsersMngDao;
import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.service.IUsersMngService;

@Service
public class UsersMngServiceImpl implements IUsersMngService{
	
	private static final Logger logger = LoggerFactory.getLogger(UsersMngServiceImpl.class);
	
	@Autowired
	private IUsersMngDao usersMngDao;
	
	@Override
	public AppDTO getQuestionear() {
		// TODO Auto-generated method stub
		logger.info("start : getQuestionear UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();
		try {
			Object obj= usersMngDao.getQuestionear();
			
			if(obj != null) {
				appDTO.setData(obj);
			}
			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_MESSAGE);
		} catch (DataAccessException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("end : getQuestionear UsersMngServiceImpl ");
		return null;
	}

}
