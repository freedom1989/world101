package com.world101.projname.web.front.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.world101.projname.web.front.dao.spec.IMessageDaoFactory;
import com.world101.projname.web.front.dao.spec.MessageDao;

@Component
public class JdbcDaoFactory implements IMessageDaoFactory {

	@Autowired
	private MessageDaoImpl messageDao;

	public JdbcDaoFactory() {
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

}
