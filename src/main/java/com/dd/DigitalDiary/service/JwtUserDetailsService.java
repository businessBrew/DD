package com.dd.DigitalDiary.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.entity.Roles;
import com.dd.DigitalDiary.entity.Users;
import com.dd.DigitalDiary.repo.RolesRepository;
import com.dd.DigitalDiary.repo.UserRepo;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private RolesRepository roleRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userDao.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}else {
			
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}
	
	
}