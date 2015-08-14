package com.world101.projname.web.front.repositories.spec;

import org.springframework.data.repository.Repository;

import com.world101.projname.web.front.dto.UserDto;

public interface UserRepository extends Repository<UserDto, Long>{
	
}
