package com.dd.DigitalDiary.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dd.DigitalDiary.entity.Users;


@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
	
	public Users findByUserName(String userName);
	
	@Modifying
	@Transactional
	@Query("update Users set password:password where userId : userId ")
	public void updatePasswordByUserId(Integer userId,String password);
	
}