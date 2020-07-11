package com.dd.DigitalDiary.service.Impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dao.impl.DigidiaryDaoImpl;
import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.dto.StudentDTO;
import com.dd.DigitalDiary.service.IDigidiaryService;

@Service
public class DigidiaryServiceImpl implements IDigidiaryService{
	
	private static final Logger logger = LoggerFactory.getLogger(DigidiaryServiceImpl.class);
	
	
	@Autowired
	DigidiaryDaoImpl digitalDaoImpl;


	@Override
	public AppDTO saveStudentInfo(StudentDTO student) {
		// TODO Auto-generated method stub
		logger.info("Start: saveStudentServiceImple ");
		
		AppDTO appDTO = new AppDTO();

		try {
			Object studentObj = digitalDaoImpl.saveStudentInfo(student);

			if (studentObj != null)
				appDTO.setData(studentObj);

			appDTO.setMessage(DDCommonConstant.SUCCESS_MESSAGE);
			appDTO.setStatus(DDCommonConstant.SUCCESS_CODE);

		} catch (DataAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("End: saveStudentServiceImple ");
		return appDTO;
	}

}
