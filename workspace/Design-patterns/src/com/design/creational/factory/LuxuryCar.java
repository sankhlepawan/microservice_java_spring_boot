package com.design.creational.factory;

public class LuxuryCar extends Car {

	
	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Luxury car...");

	}

}
