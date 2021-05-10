package com.java.ess.daythird;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;


public class AccountService  {  /*implements MethodBeforeAdvice, AfterReturningAdvice , MethodInterceptor*/
	
	public void executeMethod(JoinPoint jp) {
		System.out.println("Join point...");
	}

	/*@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0.getName());
		System.out.println(arg1.length);
		System.out.println(arg2.getClass().getName());
		System.out.println("Service method inside");
		
		
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("1");
		arg0.proceed();
		System.out.println("2");
		return null;
	}*/

	


}
