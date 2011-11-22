package com.game.swar.jedis;

import redis.clients.jedis.Jedis;

public interface JedisCallback {
	
	Object doRedis(Jedis jedis) throws Exception;

}
