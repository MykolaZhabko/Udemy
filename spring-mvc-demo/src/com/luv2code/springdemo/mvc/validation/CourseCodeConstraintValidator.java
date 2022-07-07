package com.luv2code.springdemo.mvc.validation;

import java.util.Iterator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		
		if (theCode != null) {
		
			//Loop thru the course prefixes
			//and check to see if code matches any of the course prefixes
		
			for(String tempPrefix: coursePrefixes) {
				result = theCode.startsWith(tempPrefix);
				
				//if we found a match then break out of the loop
				if (result) {
					break;
				}
			}
		
		} else {
			return true;
		}
		
		return result;
	}

}
