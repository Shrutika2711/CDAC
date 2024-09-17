package org.assig5_Vehicle;

class Car extends Vehicle {
	private String model;
	
	public Car(String make, int year, String model) {
		super(make,year);
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public String getCarInfo() {
		return getVehicleInfo() + ",Model: " + model;
	}
}
