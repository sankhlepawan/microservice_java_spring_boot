package com.design.creational.abstractfactory;

public abstract class Car {

	private CarType model;
	private Location location;
	
	public Car(CarType type, Location location) {
		this.model = type;
		this.location = location;
		arrengeParts();
	}

	private void arrengeParts() {
		System.out.println("arrenge parts...");
	}
	
	public abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
