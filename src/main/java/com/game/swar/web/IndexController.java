package com.game.swar.web;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.game.swar.aop.TestApi;
import com.game.swar.member.service.UserService;
import com.game.swar.model.Parameter;
import com.game.swar.service.RedisTestService;


@Controller
public class IndexController {
	
    private static final Logger logger = Logger.getLogger(IndexController.class);

    @Resource
    RedisTestService redisTestService;

    @Resource
    UserService userService; 

	@RequestMapping({"","/","/index"})
	@TestApi
	public ModelAndView index(ModelAndView mav) {
		
		Parameter param = new Parameter();
		param.setParam1("1111");
		param.setParam2("2222");
		param.setParam3(new Date());
		param.setParam4(999);
		
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map = om.convertValue(param, Map.class);
		
		
		logger.debug (map);
		
		try {
			redisTestService.TestPut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		logger.debug (userService.getUser(1));
		
		
		
		mav.setViewName("index/index");
		return mav;
	}
	
	@RequestMapping("/calc")
	@TestApi
	public ModelAndView calc(ModelAndView mav) {
		
		
		
		
		mav.setViewName("/calc/index");
		return mav;
	}
}
