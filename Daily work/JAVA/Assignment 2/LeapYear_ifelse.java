package Assignment1;

public class LeapYear_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1999;
		if( year % 4 == 0 || year % 100 == 0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
