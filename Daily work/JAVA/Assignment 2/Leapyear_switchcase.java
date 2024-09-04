package Assignment1;

public class Leapyear_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 2004; 
		switch (y % 4 == 0 ?( y % 100 == 0 ? 0 : 1 ): 1) {
		case 1: 
			System.out.println(y + " is a leap year");
			break;
		case 0:
			System.out.println(y + " is not a leap year");
		
		default:
			System.out.println();
				}
		
		
		}

}
