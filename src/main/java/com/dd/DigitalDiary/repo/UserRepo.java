package com.dd.DigitalDiary.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dd.DigitalDiary.entity.Users;


@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
	
	Users findByUserName(String userName);
	
}