package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

	@Autowired
	private Laptop laptop;
	
	public void show() {
		System.out.println("Inside Human Show!!!");
		laptop.setBrand("Sony Xperia");
		System.out.println(laptop.toString());
	}
	
	
}
