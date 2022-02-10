package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private final String[] fortunes = { "Today is your lucky day!", "The best day ever", "Now you better go study" };

	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
