package org.Assig5_VehicleEngine;

class Motorcycle extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Motorcycle's engine revs up with roar!");
	}
	@Override
	public void stopEngine() {
		System.out.println("Motorcycle's engine cuts  off with a sharp halt");
	}
}
