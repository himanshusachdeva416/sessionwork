package com.java.ess.daythird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		FilterMethod fm = (FilterMethod)context.getBean("proxy");
		fm.deposit(10000);*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopaspect.xml");
		FilterMethod fm = (FilterMethod)ctx.getBean("account");
		fm.deposit(1000);

		
		

	}

}
