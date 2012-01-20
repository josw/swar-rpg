package com.game.swar.map.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.game.swar.map.dao.MapDao;
import com.game.swar.map.model.Map;

@Repository
public class MapDaoImpl extends SqlSessionDaoSupport implements MapDao {

	@Override
	public List<Map> getMap() {
		return getSqlSession().getMapper(MapDao.class).getMap();
	}

}
