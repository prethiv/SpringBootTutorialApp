package com.example.demo;

import org.springframework.stereotype.Component;

//We can specify name for a bean using @Component("<NAME>")
//By default it will be class name in all small letters

@Component("lap1")
public class Laptop {
	
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop id :"+lid+" Brand :"+brand;
	}
	
	public void compile() {
		System.out.println("Compiling !!!");
	}
	

}
