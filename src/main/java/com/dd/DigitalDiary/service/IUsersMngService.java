package com.dd.DigitalDiary.service;

import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.dto.UserDTO;

public interface IUsersMngService {
	
	public AppDTO getQuestionear();
	
	public AppDTO registerNewUser(UserDTO userDto);
	
	public AppDTO changePassword(UserDTO userDto);
	
	public AppDTO getRoles();

}
