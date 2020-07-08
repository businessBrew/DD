package com.dd.DigitalDiary.service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dao.IUsersMngDao;
import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.entity.Roles;
import com.dd.DigitalDiary.entity.Users;
import com.dd.DigitalDiary.repo.RolesRepository;
import com.dd.DigitalDiary.repo.UserRepo;
import com.dd.DigitalDiary.service.IUsersMngService;

@Service
public class UsersMngServiceImpl implements IUsersMngService {

	private static final Logger logger = LoggerFactory.getLogger(UsersMngServiceImpl.class);

	@Autowired
	private IUsersMngDao usersMngDao;

	@Override
	public AppDTO getQuestionear() {
		// TODO Auto-generated method stub
		logger.info("start : getQuestionear UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();
		try {
			Object obj = usersMngDao.getQuestionear();

			if (obj != null) {
				appDTO.setData(obj);
			}
			appDTO.setMessage(DDCommonConstant.SUCCESS_CODE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_MESSAGE);
		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("end : getQuestionear UsersMngServiceImpl ");
		return appDTO;
	}

	@Override
	public AppDTO registerNewUser(UserDTO userDto) {
		
		logger.info("start : registerNewUser UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();

		try {
			Object userObj = usersMngDao.registerNewUser(userDto);

			if (userObj != null)
				appDTO.setData(userObj);

			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_CODE);

		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("End : registerNewUser UsersMngServiceImpl ");
		return appDTO;
	}

	@Override
	public AppDTO changePassword(UserDTO userDto) {
		// TODO Auto-generated method stub
		logger.info("start : changePassword UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();

		try {
			Object userObj = usersMngDao.changePassword(userDto);

			if (userObj != null)
				appDTO.setData(userObj);

			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_CODE);

		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("End : changePassword UsersMngServiceImpl ");
		return appDTO;
	}

	@Override
	public AppDTO getRoles() {
		// TODO Auto-generated method stub
		logger.info("start : getRoles UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();

		try {
			Object roleObj = usersMngDao.getRoles();

			if (roleObj != null)
				appDTO.setData(roleObj);

			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_CODE);

		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("End : getRoles UsersMngServiceImpl ");
		return appDTO;
	}

	@Override
	public AppDTO createUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		logger.info("start : createUser UsersMngServiceImpl ");
		AppDTO appDTO = new AppDTO();

		try {
			Object userObj = usersMngDao.createUser();

			if (userObj != null)
				appDTO.setData(userObj);

			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_CODE);

		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("End : getRoles UsersMngServiceImpl ");
		return appDTO;
	}

}
