package Assignment_2;

public class Q9_Primitivevalue {
	boolean instanceBool;
	char instanceChar;
	byte instanceByte;
	short instanceShort;
	int instanceInt;
	long instanceLong;
	float instanceFloat;
	double instanceDouble;
	static boolean staticBool;
	static char staticChar;
	static byte staticByte;
	static short staticShort;
	static int staticInt;
	static long staticLong;
	static float staticFloat;
	static double staticDouble;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9_Primitivevalue p = new Q9_Primitivevalue();
		System.out.println("Instance Variables:");
		System.out.println("boolean: " + p.instanceBool);
		System.out.println("char: " + (int) p.instanceChar); // char defaults to '\u0000', which is 0
		System.out.println("byte: " + p.instanceByte);
		System.out.println("short: " + p.instanceShort);
		System.out.println("int: " + p.instanceInt);
		System.out.println("long: " + p.instanceLong);
		System.out.println("float: " + p.instanceFloat);
		System.out.println("double: " + p.instanceDouble);
		System.out.println("\nStatic Variables:");
		System.out.println("boolean: " + staticBool);
		System.out.println("char: " + (int) staticChar); // char defaults to '\u0000', which is 0
		System.out.println("byte: " + staticByte);
		System.out.println("short: " + staticShort);
		System.out.println("int: " + staticInt);
		System.out.println("long: " + staticLong);
		System.out.println("float: " + staticFloat);
		System.out.println("double: " + staticDouble);
	}

}
