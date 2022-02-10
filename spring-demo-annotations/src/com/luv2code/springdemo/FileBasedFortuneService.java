package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileBasedFortuneService implements FortuneService {
	
	private List<String> dataList = new ArrayList<>();
	private Random myRandom = new Random();
	public FileBasedFortuneService() {
		System.out.println("FileBasedFortuneService: Inside default constructor!");
		
	}
	
	// define sturtup method
	@PostConstruct
	private void startupMethod() {
		System.out.println("FileBasedFortuneService: inside startup method!");
		try {
			File file = new File("src/fortunes.txt");
			FileReader fReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fReader);
			String line;
			
			while ((line = br.readLine()) != null) {
				dataList.add(line);
			}
			fReader.close();
			System.out.println(dataList.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	private void cleanupMethod() {
		System.out.println("FileBasedFortuneService: inside cleanup method");
	}
	
	// define cleanup method
	
	@Override
	public String getFortune() {
		return dataList.get(myRandom.nextInt(dataList.size()));
	}

}
