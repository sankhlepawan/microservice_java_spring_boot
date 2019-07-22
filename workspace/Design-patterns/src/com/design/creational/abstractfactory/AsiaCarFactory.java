package com.design.creational.abstractfactory;

public class AsiaCarFactory {

	public static Car buildCar(com.design.creational.factory.CarType small) {
		Car car = null;
		switch(small) {
		case SMALL:
			car = new SmallCar(Location.ASIA);
			break;
		case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;
		default:
			break;
			
		}
		return car;
		
	}
}
