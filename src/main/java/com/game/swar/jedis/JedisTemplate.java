package com.game.swar.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTemplate {

	private JedisPool jedisPool;
	
	public JedisTemplate(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}
	
	public Object execute(JedisCallback action) {
		Object result = null;
		Jedis jedis = jedisPool.getResource();
		try {
			result = action.doRedis(jedis);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedisPool.returnResource(jedis);
			jedisPool.destroy();
		}
		
		return result;
	}
}
