package com.game.swar.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
	
    private static final Logger logger = Logger.getLogger(TestAspect.class);


	
	@Around("@annotation(testApi)")
	public Object doTest(ProceedingJoinPoint pjp, TestApi testApi) throws Throwable {
		
		logger.debug ("do test.....");
		Object retVal = pjp.proceed();
		logger.debug ("end .....");
		return retVal; 
	}
	


}
