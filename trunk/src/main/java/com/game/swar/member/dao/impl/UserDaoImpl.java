package com.game.swar.member.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.game.swar.member.dao.UserDao;
import com.game.swar.member.model.User;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUser(long userId) {


		return (User) getSqlSession().selectOne("com.game.swar.member.dao.UserDao.getUser", userId);
	}

}
