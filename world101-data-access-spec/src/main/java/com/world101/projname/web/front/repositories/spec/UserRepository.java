package com.world101.projname.web.front.repositories.spec;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.world101.projname.web.front.dto.UserDto;

public interface UserRepository extends Repository<UserDto, Long> {
	List<UserDto> findAll();

	UserDto findById(long id);
	
	UserDto findByLoginName(String loginName);
	
	UserDto save(UserDto user);
}
