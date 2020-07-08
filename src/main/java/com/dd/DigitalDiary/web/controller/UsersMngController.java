package com.dd.DigitalDiary.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dd.DigitalDiary.config.JwtTokenUtil;
import com.dd.DigitalDiary.dto.AppDTO;
import com.dd.DigitalDiary.dto.UserDTO;
import com.dd.DigitalDiary.entity.JwtRequest;
import com.dd.DigitalDiary.entity.JwtResponse;
import com.dd.DigitalDiary.service.IUsersMngService;
import com.dd.DigitalDiary.service.JwtUserDetailsService;

@RestController
@CrossOrigin
public class UsersMngController {
	
	private static final Logger logger = LoggerFactory.getLogger(UsersMngController.class);
	
	@Autowired
	private IUsersMngService iUsersMngService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	
	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		UserDTO userdto = new UserDTO();
		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);
		userdto.setJwtToken(token);
		userdto.setUserName(authenticationRequest.getUsername());
		userdto.setPassword("******");
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
	@PostMapping(value = "/registerNewUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user){
		AppDTO obj = iUsersMngService.registerNewUser(user);
		return new ResponseEntity<Object>(obj,HttpStatus.OK);
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	
	@GetMapping(value = "/listQuestion")
	public ResponseEntity<Object> getQuestionear(){
		logger.info("Start: getQuestionear ");
		
		AppDTO queData = iUsersMngService.getQuestionear();
		
		logger.info("End: getQuestionear ");
		return new ResponseEntity<Object>(queData,HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/changePassword")
	public ResponseEntity<Object> ChangePassword(@RequestBody UserDTO userDto){
		logger.info("Start: ChangePassword ");
		
		AppDTO queData = iUsersMngService.changePassword(userDto);
		
		logger.info("End: ChangePassword ");
		return new ResponseEntity<Object>(queData,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getRoles")
	public ResponseEntity<Object> getRoles(){
		logger.info("Start: getroles ");
		
		AppDTO queData = iUsersMngService.getRoles();
		
		logger.info("End: getroles ");
		return new ResponseEntity<Object>(queData,HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/creaeUsert")
	public ResponseEntity<Object> creaeUsert(@RequestBody UserDTO userDto){
		logger.info("Start: getroles ");
		
		AppDTO queData = null;//iUsersMngService.creaeUsert();
		
		logger.info("End: getroles ");
		return new ResponseEntity<Object>(queData,HttpStatus.OK);
		
	}

}
