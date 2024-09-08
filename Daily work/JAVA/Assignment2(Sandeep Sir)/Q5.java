package Assignment_2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = Long.BYTES;
//		System.out.println("Long value : " + b);//b
		
//		long b = Long.MIN_VALUE;
//		long c = Long.MAX_VALUE;
//		System.out.println("Long Min value : " + b);
//		System.out.println("Long MAX value : " + c); //c
		
//		long b = 10;
//		String str = Long.toString(b);
//		System.out.println("Long String value : " + str); //d
		
//		String str = "10";
//		long b = Long.parseLong(str);
//		System.out.println("String to long value : " + b); //e
		
//		String str = "Ab12Cd3";
//		long b = Long.parseLong(str);
//		System.out.println("String to long value : " + b); //f
		
//		long b = 100;
//		long b1 = Long.valueOf(b);
//		System.out.println("wrapper class value : " + b1); //g
		
//		String strNumber = "1000";
//		long b1 = Long.valueOf(strNumber);
//		System.out.println("wrapper class value : " + b1); //h
		
//		long b = 1123;
//		long b1 = 9845;
//		long result = Long.sum(1123,9845);
//		System.out.println("long class sum : " + result); //i
		
		long number = 7;
		String binary = Long.toBinaryString(number);
		String octal = Long.toOctalString(number);
		String hexadecimal = Long.toHexString(number);
		System.out.println("long Binary value : " + binary);
		System.out.println("long Octal value : " + octal);
		System.out.println("long Hexadecimal value : " + hexadecimal);//k
	}

}
