package com.aSsignment3;

import java.util.Scanner;

public class Q5_RevenueManagement {
	private double cRate;
    private double tRate;
    private double mRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;
    private double revenue;
    
    public void setTollRates() {
        Scanner s = new Scanner(System.in);

        System.out.print("rate for Cars: ");
        cRate = s.nextDouble();

        System.out.print("rate for Trucks: ");
        tRate = s.nextDouble();

        System.out.print("rate for Motorcycles: ");
        mRate = s.nextDouble();
    }
    
    public void acceptRecord() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of Cars passing through: ");
        carCount = s.nextInt();

        System.out.print("Enter the number of Trucks passing through: ");
        truckCount = s.nextInt();

        System.out.print("Enter the number of Motorcycles passing through: ");
        motorcycleCount = s.nextInt();

        s.close();
    }
    public void calculateRevenue() {
        revenue = (carCount * cRate) + (truckCount * tRate) + (motorcycleCount * mRate);
    }
    
    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;

        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f%n", revenue);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5_RevenueManagement m = new Q5_RevenueManagement();
		m.setTollRates();
		m.acceptRecord();
		m.calculateRevenue();
		m.printRecord();
	}

}
