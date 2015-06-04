package com.world101.projname.web.front.dao.impl;

import org.springframework.stereotype.Repository;

import com.world101.projname.web.front.dao.spec.MessageDao;

@Repository
public class MessageDaoImpl implements MessageDao {

	@Override
	public String getMessage() {
		return "world";
	}

}
