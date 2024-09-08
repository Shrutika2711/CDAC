package Assignment_2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = Integer.BYTES;
//		System.out.println("Integer value : " + b); //b
		
//		int b = Integer.MIN_VALUE;
//		int C = Integer.MAX_VALUE;
//		System.out.println("Integer value : " + b);
//		System.out.println("Integer value : " + C); //c
		
//		int b = 10;
//		String str = Integer.toString(b);
//		System.out.println(" String value : " + str); //d
		
//		String strNumber = "12345";
//		int b = Integer.parseInt(strNumber);
//		System.out.println("Integer value : " + b);  //e
		
//		String strNumber = "12345";
//		int b = Integer.parseInt(strNumber);
//		System.out.println("Integer value : " + b); //f
		
//		int Number = 12345;
//		int b = Integer.valueOf(+Number);
//		System.out.println("Integer value : " + b); //g
		
//		String strNumber = "12345";
//		int b = Integer.valueOf(strNumber);
//		System.out.println("Integer value : " + b); //h
		
//		int a =10;
//		int b =20;
//		int result = Integer.sum(10,20);
//		System.out.println("Integer value : " + result); //i
		
//		int a =10;
//		int b =20;
//		int Min = Integer.min(10,20);
//		int Max = Integer.max(10,20);
//		System.out.println("Integer MINIMUM value : " + Min);
//		System.out.println("Integer MAXMIUM value : " + Max); //j
		
		int number =7;
		String binary = Integer.toBinaryString(number);
		String octal = Integer.toOctalString(number);
		String hexa = Integer.toHexString(number);
		System.out.println("Integer BINARY value : " + binary);
		System.out.println("Integer OCTAL value : " + octal);
		System.out.println("Integer HEXADECIMAL value : " + hexa); //k
	}

}
