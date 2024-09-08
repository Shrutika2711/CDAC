package Assignment_2;

public class Q8_PrimitiveandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boolVal = true;
		char charVal = 'A';
		byte byteVal = 10;
		short shortVal = 100;
		int intVal = 1000;
		long longVal = 10000L;
		float floatVal = 10.5f;
		double doubleVal = 100.123;
		System.out.println("Using Wrapper Class toString Methods:");
		System.out.println("boolean: " + Boolean.toString(boolVal));
		System.out.println("char: " + Character.toString(charVal));
		System.out.println("byte: " + Byte.toString(byteVal));
		System.out.println("short: " + Short.toString(shortVal));
		System.out.println("int: " + Integer.toString(intVal));
		System.out.println("long: " + Long.toString(longVal));
		System.out.println("float: " + Float.toString(floatVal));
		System.out.println("double: " + Double.toString(doubleVal));
		System.out.println("\nUsing String valueOf Methods:");
		System.out.println("boolean: " + String.valueOf(boolVal));
		System.out.println("char: " + String.valueOf(charVal));
		System.out.println("byte: " + String.valueOf(byteVal));
		System.out.println("short: " + String.valueOf(shortVal));
		System.out.println("int: " + String.valueOf(intVal));
		System.out.println("long: " + String.valueOf(longVal));
		System.out.println("float: " + String.valueOf(floatVal));
		System.out.println("double: " + String.valueOf(doubleVal));
	}

}
