package com.luv2code.springdemo;

public class ExFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have hardcoded fortune press ANY button!";
	}

}
