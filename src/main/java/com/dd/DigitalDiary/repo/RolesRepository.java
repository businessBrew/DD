package com.dd.DigitalDiary.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dd.DigitalDiary.entity.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer>{
	
	Roles findByRoleName(String name);
	
	List<Roles> findAll();

}
