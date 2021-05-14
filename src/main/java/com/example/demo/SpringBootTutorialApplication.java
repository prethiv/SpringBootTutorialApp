package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootTutorialApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		a.setAid(1);
		System.out.println("Printing A id "+a.getAid());
		Alien b = context.getBean(Alien.class);
		b.show();
		b.setAid(2);
		System.out.println("Printing B id "+b.getAid());
		System.out.println("Printing A id "+a.getAid());

	}

}
