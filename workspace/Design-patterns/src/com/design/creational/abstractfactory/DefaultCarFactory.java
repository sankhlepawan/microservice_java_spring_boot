package com.design.creational.abstractfactory;

public class DefaultCarFactory {

	public static Car buildCar(com.design.creational.factory.CarType small) {
		Car car = null;
		switch(small) {
		case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;
		case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		default:
			break;
			
		}
		return car;
		
	}
}
