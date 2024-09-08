package Assignment_2;

public class Q2_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte B = Byte.BYTES;
//		System.out.println("bytes value :" + B); //b
		
//		byte min = Byte.MIN_VALUE;
//		byte max = Byte.MAX_VALUE;
//		System.out.println("Minimum value: " + min);
//      System.out.println("Maximum value: " + max);  //c
		
//		byte number = 6;
//		String str = Byte.toString(number);
//		System.out.println("String value : " + str);  //d
		
//		String s = "100";
//		byte b = Byte.parseByte(s);
//		System.out.println("String value : " + b); //e
		
//		String s = "Ab12Cd3";
//		try {
//		byte n = Byte.parseByte(s);
//		System.out.println(n);
//		}catch(NumberFormatException e) {
//			System.out.println(" " + s); //f
//		}
		
//		byte Number = 100;
//		byte b = Byte.valueOf(Number);
//		System.out.println("String value : " + b); ///g

		String strNumber = "10";
		byte b = Byte.valueOf(strNumber);
		System.out.println("String value : " + b);// h
	}

}
