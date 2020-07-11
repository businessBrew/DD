package com.dd.DigitalDiary.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.dd.DigitalDiary.entity.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	
	public Users findByUserName(String userName);
	
	@Modifying
	@Transactional
	@Query("update Users set password= :password where userId= :userId ")
	public void updatePasswordByUserId(@Param("userId")Integer userId,@Param("password")String password);
	
}