package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("alphaCoach", Coach.class);
		Coach alphaCoach2 = context.getBean("alphaCoach", Coach.class);
		
		
		System.out.println(theCoach.getDalyWorkout());
		System.out.println(alphaCoach.getDalyWorkout());
		
		System.out.println("Is alphaCoahes same: " + (alphaCoach == alphaCoach2));
		
		//close the context
		context.close();
	}

}
