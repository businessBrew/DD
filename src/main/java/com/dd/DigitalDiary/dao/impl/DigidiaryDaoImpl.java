package com.dd.DigitalDiary.dao.impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.dd.DigitalDiary.dao.IDigidiaryDao;
import com.dd.DigitalDiary.dto.StudentDTO;
import com.dd.DigitalDiary.entity.StudentInfo;
import com.dd.DigitalDiary.repo.StudentInfoRepository;

@Repository
public class DigidiaryDaoImpl implements IDigidiaryDao{
	
	private static final Logger logger = LoggerFactory.getLogger(DigidiaryDaoImpl.class);
	
	@Autowired
	public StudentInfoRepository studentRepo;
	
	

	@Override
	public Object saveStudentInfo(StudentDTO student) throws DataAccessException,SQLException{
		// TODO Auto-generated method stub
		logger.info("Start: saveStudentService DaoImpl ");
		StudentInfo studentInfo = new StudentInfo();
		BeanUtils.copyProperties(student, studentInfo);
		
		StudentInfo studentData = studentRepo.save(studentInfo);
		logger.info("End: saveStudentService DaoImpl ");
		return studentData;
	}

}
