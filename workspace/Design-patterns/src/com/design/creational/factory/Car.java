package com.design.creational.factory;

public abstract class Car {
	
	private CarType model;
	
	public Car(CarType model) {
		this.model = model;
		arrengeParts();
		
	}
	
	private void arrengeParts() {}
	
	protected  abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
}
