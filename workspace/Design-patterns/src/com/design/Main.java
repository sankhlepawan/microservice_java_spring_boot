package com.design;

import com.design.creational.builder.User;
import com.design.creational.builder.UserBuilder;
import com.design.creational.factory.Car;
import com.design.creational.factory.CarFactory;
import com.design.creational.factory.CarType;
import com.design.creational.prototype.Models.Movie;
import com.design.creational.prototype.PrototypeCapable;
import com.design.creational.prototype.PrototypeFactory;
import com.design.creational.prototype.PrototypeFactory.ModelType;
	

public class Main {
	
	
	static String a = "pawan";
	String b = "napwan";
	
	public static String reverse(String s) {
		if(s.length() == 1) {
			return s;
		}
		
		return reverse(s.substring(1, s.length())) + s.charAt(0);
	}
	
 public static void main(String[] args) {
	
	 
	System.err.println(reverse(a));
	/* ######### Builder Design Pattern ########## */
	 
	User ub = new UserBuilder("pawan","sankhle")
	.email("pawan@gmail.com")
	.id(1).build();
	
	
	
	/* ######### prototype Design Pattern ########## */
	PrototypeFactory factory = new PrototypeFactory();
	try {
		PrototypeCapable movie = factory.getInstance(ModelType.MOVIE);
		Movie m = (Movie) movie;
		m.setName("akber");
		System.err.println("movie => " + m);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/* ##########Factory Design Pattern############# */
	Car small = CarFactory.buildCar(CarType.SMALL);
	Car sedan = CarFactory.buildCar(CarType.SEDAN);
	Car luxury = CarFactory.buildCar(CarType.LUXURY);
	
	// System.out.println(small + " " + sedan + " " + luxury);
	
	/* ########## Abstract Factory Design Pattern############# */
	
	com.design.creational.abstractfactory.Car small1 = com.design.creational.abstractfactory.CarFactory.buildCar(CarType.SMALL);
	
	
 }
}
