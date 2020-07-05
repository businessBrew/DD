package com.dd.DigitalDiary.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.entity.Users;
import com.dd.DigitalDiary.repo.UserRepo;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userDao.findByUserName(username);
		if (user != null) {
			throw new UsernameNotFoundException(DDCommonConstant.USER_NOT_FOUND + username);
		}else {}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}
	
	
}