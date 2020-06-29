package com.dd.DigitalDiary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dd.DigitalDiary.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
