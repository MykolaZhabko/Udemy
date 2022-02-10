package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BikeCoach implements Coach {
	
	FortuneService theFortuneService;
	
	public BikeCoach(FortuneService fortuneService) {
		this.theFortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Ride 20km ofroad track";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
