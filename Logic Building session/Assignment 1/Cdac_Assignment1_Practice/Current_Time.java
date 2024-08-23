package Cdac_Assignment1_Practice;

import java.time.LocalTime;

public class Current_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!");
        } 
        
        else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!");
        } 
        
        else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening!");
        } 
        
        else {
            System.out.println("Good Night!");
        }

	}

}
