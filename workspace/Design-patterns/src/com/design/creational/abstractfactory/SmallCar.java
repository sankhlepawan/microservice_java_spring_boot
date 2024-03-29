package com.design.creational.abstractfactory;

public class SmallCar extends Car{

	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("constructing small car...");
	}

}
