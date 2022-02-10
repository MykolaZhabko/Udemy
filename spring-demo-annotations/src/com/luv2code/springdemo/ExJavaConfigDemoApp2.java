package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExJavaConfigDemoApp2 {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExSportConfig.class);
		// get the bean from spring container
		
		BikeCoach theCoach = context.getBean("bikeCoach", BikeCoach.class);
		// call a method on the bean
//		System.out.println("Email: " + theCoach.getEmail());
//		System.out.println("Team: " + theCoach.getTeam());
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
	
		//close the context
		context.close();
	}

}
	