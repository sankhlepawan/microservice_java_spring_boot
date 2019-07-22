package com.design.creational.abstractfactory;

public class CarFactory {

	private CarFactory() {};
	
	public static Car buildCar(com.design.creational.factory.CarType small) {
		Car car = null;
		Location location = Location.ASIA;
		
		switch(location)
	    {
	      case USA:
	        car = USACarFactory.buildCar(small);
	        break;
	      case ASIA:
	        car = AsiaCarFactory.buildCar(small);
	        break;
	      default:
	        car = DefaultCarFactory.buildCar(small);
	    }
		
		return car;
	}
}
