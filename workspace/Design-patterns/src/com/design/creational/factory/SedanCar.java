package com.design.creational.factory;

public class SedanCar extends Car {

	
	public SedanCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building SedanCar car...");

	}

}
