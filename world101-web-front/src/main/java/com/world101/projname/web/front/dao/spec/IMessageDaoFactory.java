package com.world101.projname.web.front.dao.spec;

import org.springframework.stereotype.Component;

@Component
public interface IMessageDaoFactory {
	MessageDao getMessageDao();
}
