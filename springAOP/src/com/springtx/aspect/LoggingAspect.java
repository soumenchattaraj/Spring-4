package com.springtx.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/* 
   @Configuration indicates that a class declares one or more @Bean methods and may 
   be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
*/
@Configuration
@Aspect
//## @EnableAspectJAutoProxy to enable auto proxy in aspectj which is required for its functioning.
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	
	@Pointcut("execution(* com.springtx.controller.DefaultController.defaultLocation())")
	public void myOperation() {}
	
	
	@Before("myOperation()")
	public void loggingAdvice()
	{
		System.out.println("this is an advice..1..");
	}
	
	
}
