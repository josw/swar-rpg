package com.game.swar.member.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.game.swar.member.dao.UserDao;
import com.game.swar.member.model.User;

@Service
public class UserService {
	
	@Resource
	UserDao userDao;
	
	
	public User getUser(long userId) {
		return userDao.getUser(userId);
	}

}
