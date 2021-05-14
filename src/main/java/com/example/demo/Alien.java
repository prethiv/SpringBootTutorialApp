package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Component annotation tells spring to create a bean (object) inside a spring container
//By default spring is implemented as singeton object provider 
//it means for every component annotatin only one bean gets created inside spring container
//even if we try to get one using context.getBean we wont get one
//To overcome this thing we can use scope annotation by defining scope 
//we can have multiple bean instance created inside a spring container.
//Also if we did not use scope annitation by default spring will create a object 
//for us no matter if we use it or not
//But if we put scope spring will create a bean instance only on the request.
//Autowired annotation tells spring that this component is dependent on one object that is there in 
//Spring container 
//Qualifier annotation tells spring to search from the spring container based on names
//By default autowired is searching based on class name in small letters which is nothing but type 
//in this case it is laptop.class

@Component
@Scope(value="prototype")
public class Alien {
	
	public int aid;
	public String name;
	public String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	Alien(){
		super();
		System.out.println("Alien Constructor");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Inside show of Alien Class");
		laptop.compile();
		laptop.setBrand("Sony vaio");
		System.out.println(laptop.toString());
	}
	

}
