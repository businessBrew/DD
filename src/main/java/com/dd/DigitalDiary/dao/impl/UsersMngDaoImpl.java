package com.dd.DigitalDiary.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dao.IUsersMngDao;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.entity.Roles;
import com.dd.DigitalDiary.entity.Users;
import com.dd.DigitalDiary.repo.HintQuestionRepository;
import com.dd.DigitalDiary.repo.RolesRepository;
import com.dd.DigitalDiary.repo.UserRepo;
import com.dd.DigitalDiary.util.UserAlreadyExistException;


@Repository
public class UsersMngDaoImpl implements IUsersMngDao{
	
	private static final Logger logger = LoggerFactory.getLogger(UsersMngDaoImpl.class);
	
	@Autowired
	HintQuestionRepository questionRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private RolesRepository roleRepository;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Object getQuestionear() throws DataAccessException,SQLException {
		// TODO Auto-generated method stub
		logger.info("start : getQuestionear UsersMngDaoImpl ");
		Object obj = questionRepository.findAll();
		logger.info("End : getQuestionear UsersMngDaoImpl ");
		return obj;
	}

	@Override
	public Object registerNewUser(UserDTO userDto) throws DataAccessException, SQLException {
		// TODO Auto-generated method stub
		logger.info("start : registerNewUser UsersMngDaoImpl ");
		Users userData = null;
		
		if(isUserExist(userDto.getUserName())) {
			throw new  UserAlreadyExistException("UserName Already Exist " + userDto.getUserName());
			
		}else {
		
		Users newUser = new Users();
		newUser.setUserName(userDto.getUserName());
		newUser.setPassword(bcryptEncoder.encode(DDCommonConstant.DEFAULT_USER_PASSWORD));
		newUser.setIsActive(DDCommonConstant.USER_ACTIVATION_FLAG);
		newUser.setLastUpdated(new Date());
		newUser.setLastaccessed(new Date());
		Collection<Roles> roleList = new ArrayList<Roles>();
		if(userDto.getPassword() == null) {
			Roles role = roleRepository.findByRoleName(DDCommonConstant.USER_DEFAULT_ROLE_THROUGH_APP);
			roleList.add(role);
		}
		newUser.setRoles(roleList);
		
		userData = userRepo.save(newUser);
		}
		logger.info("End : registerNewUser UsersMngDaoImpl ");
		return userData;
		}
	
	public boolean isUserExist(String userName){
		
		Users userDetails = userRepo.findByUserName(userName);
		if(userDetails != null)
			return true;
		return false;
	}

}
