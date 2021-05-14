package com.example.demo;

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


@Component
@Scope(value="prototype")
public class Alien {
	
	public int aid;
	public String name;
	public String tech;
	
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
	}
	

}
