package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExSportConfig {
	
	// define bean for our fortune service
	@Bean
	public ExFortuneService exFortuneService() {
		return new ExFortuneService();
	}
	
	@Bean
	public BikeCoach bikeCoach() {
		return new BikeCoach(exFortuneService());
	}
	
	
}
