package com.dd.DigitalDiary.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.DigitalDiary.entity.DAOUser;


@Repository
public interface UserRepo extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}