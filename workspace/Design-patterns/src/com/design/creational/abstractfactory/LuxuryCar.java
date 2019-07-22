package com.design.creational.abstractfactory;

public class LuxuryCar extends Car{

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("constructing luxury car...");
	}
}