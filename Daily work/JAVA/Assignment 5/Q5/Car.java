package org.Assig5_VehicleEngine;

class Car extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("car's engine roars to life");
	}
	@Override
	public void stopEngine() {
		System.out.println("Car's engine shuts down quietly");
		}
	}

