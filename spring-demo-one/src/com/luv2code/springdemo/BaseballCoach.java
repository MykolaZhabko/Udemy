package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public	String getDalyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDaylyFortune() {
		//use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
	// add an init method
	public void doMystartupStuff() {
		System.out.println("BaseballCoach: inside metod doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("BaseballCoach: inside metod doMyCleanupStuffYoYo");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BaseballCoach: inside metod destroy");		
	}
}
