package com.design.creational.abstractfactory;


public class SedanCar extends Car{

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("constructing sedan car...");
	}

}

