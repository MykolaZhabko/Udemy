package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method on a bean
		System.out.println("From Spring App  "+theCoach.getDalyWorkout());
		
		//let's call our new method for fortune
		System.out.println(theCoach.getDaylyFortune());
		
		// close the context
		context.close();
	}
}
