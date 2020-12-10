package com.au.studentpro.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.time.*;

@Component
@Aspect
public class LogginAspect {

	@Before("public void startTest()")
	public void testConductingAdvice()
	{
		System.out.println(" test started "+ LocalTime.now());
	}
}
