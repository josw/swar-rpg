package com.game.swar.service;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

import com.game.swar.jedis.JedisCallback;
import com.game.swar.jedis.JedisTemplate;
import com.game.swar.web.IndexController;

@Service("redisTestService")
public class RedisTestServiceImpl implements RedisTestService {
	
    private static final Logger logger = Logger.getLogger(IndexController.class);

    
    @Resource
    JedisTemplate jedisTemplate;


	@Override
	public boolean TestPut() throws Exception{

		
		return (Boolean) jedisTemplate.execute(new JedisCallback() {
			@Override
			public Object doRedis(Jedis jedis) throws Exception {
				
				
				  jedis.set("aaaa", "bbbb");
				  String foobar = jedis.get("aaaa");


				  logger.debug (">>> foobar : " + foobar);
				  
				  
				  
				  jedis.set("foo", "bar");
				  logger.debug ("foo : " + foobar);
				  
				  jedis.zadd("sose", 0, "car"); jedis.zadd("sose", 0, "bike"); 
				  Set<String> sose = jedis.zrange("sose", 0, -1);
				  
				  logger.debug (sose);
				  
				  
				  jedis.lpush("aa", "123");
				  
				  logger.debug(jedis.lrange("aa", 0, 100));
				  
				  
				  
				
				return true;
			}
		});
		
		
		
		
	}

}
