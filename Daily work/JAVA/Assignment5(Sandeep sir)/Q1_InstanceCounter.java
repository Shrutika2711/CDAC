package com.assignment5;

class InstanceCounter {
	private static int instanceCount = 0;
	public InstanceCounter() {
		instanceCount ++;
	}
	public static int getInstanceCount() {
		return instanceCount;
	}
	@Override
	public String toString() {
		return "Total Instance: "+instanceCount;
	}
}
 public class Q1_InstanceCounter{
	 public static void main(String[] args) {
		InstanceCounter ic1	= new InstanceCounter();
		InstanceCounter ic2	= new InstanceCounter();
		//InstanceCounter ic3	= new InstanceCounter();
		System.out.println("Current instance count: "+ InstanceCounter.getInstanceCount());
		System.out.println(ic1);
		System.out.println(ic2);
		//System.out.println(ic3);
		
	}
 }
