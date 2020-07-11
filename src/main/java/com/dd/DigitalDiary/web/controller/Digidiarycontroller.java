package com.dd.DigitalDiary.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.dto.StudentDTO;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.service.IDigidiaryService;

@RestController
public class Digidiarycontroller {
	
	private static final Logger logger = LoggerFactory.getLogger(Digidiarycontroller.class);
	
	@Autowired
	private IDigidiaryService digitalService;
	
	@PostMapping(value = "/saveStudentInfo")
	public ResponseEntity<?> saveStudentInfo(@RequestBody StudentDTO student){
	
		logger.info("Start: saveStudentInfo ");
		
		AppDTO obj = digitalService.saveStudentInfo(student);
		
		
		logger.info("End: saveStudentInfo ");
		
		return new ResponseEntity<Object>(obj,HttpStatus.OK);
		
	} 
	

}
