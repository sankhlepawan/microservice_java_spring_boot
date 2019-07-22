package com.design.creational.abstractfactory;

public class USACarFactory {

	public static Car buildCar(com.design.creational.factory.CarType small) {
		Car car = null;
		switch(small) {
		case SMALL:
			car = new SmallCar(Location.USA);
			break;
		case SEDAN:
			car = new SedanCar(Location.USA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;
		default:
			break;
			
		}
		return car;
		
	}
}
