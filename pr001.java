class pr001 {
	public static void main(String args[]) {
		System.out.println("You can see that text?");
		//Primitive data types - includes byte, short, int, long, float, double, boolean and char
		//celiy
		byte b;//8bit/1byte Stores whole numbers from -128 to 127
		short s;//16bit/2byte 	Stores whole numbers from -32,768 to 32,767
		int i;//32bit/4byte 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long l;//64bit/8byte Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//item
		float f;//32bit/4byte Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double d;//64bit/8byte Stores fractional numbers. Sufficient for storing 15 decimal digits
		//symbol
		boolean bool;//1bit Stores true or false values
		char c;//16bit/2byte Stores a single character/letter or ASCII values
		c = (char)133;
		System.out.println(c);
		//Non-primitive data types - such as String, Arrays and Classes
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());	 // System.out.println(txt.toLowerCase());   // Outputs "hello world"
		//
	}
}
