package com.assignment5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l = Logger.getInstance();
		l.log("start");
		l.log("performing");
		l.log("stop");
		System.out.println("current log");
		System.out.println(Logger.getInstance());
		l.clearLog();
		System.out.println("clear");
		System.out.println(l.getLog());
	}

}
