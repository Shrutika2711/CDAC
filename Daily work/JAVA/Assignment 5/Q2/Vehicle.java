package org.assig5_Vehicle;

public class Vehicle {
	private String make;
	private int year;
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	public int getYear() {
		return year;
	}
	public String getVehicleInfo() {
		return "Make: " + make + ",year: " + year;
	}
}
