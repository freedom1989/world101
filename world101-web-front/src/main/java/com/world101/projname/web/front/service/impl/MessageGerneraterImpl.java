package com.world101.projname.web.front.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world101.projname.web.front.dao.spec.IMessageDaoFactory;
import com.world101.projname.web.front.service.spec.MessageGenerater;

@Service
public class MessageGerneraterImpl implements MessageGenerater {

	private final IMessageDaoFactory daoFactory;

	@Autowired
	public MessageGerneraterImpl(IMessageDaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public String getMessage() {
		return daoFactory.getMessageDao().getMessage();
	}

}
