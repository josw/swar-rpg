package com.game.swar.map.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.game.swar.map.dao.MapDao;
import com.game.swar.map.model.Map;

@Service
public class MapService {
	
	@Resource
	private MapDao mapDao;

	
	public List<Map> getMap() {
		return (List<Map>) mapDao.getMap();
	}
}
