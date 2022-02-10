package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDalyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDaylyFortune() {
		return "Just do it: " +  fortuneService.getFortune();
	}
	
	// add an init method
	public void doMystartupStuff() {
		System.out.println("TrackCoach: inside metod doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside metod doMyCleanupStuffYoYo");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside metod destroy");		
	}

}
