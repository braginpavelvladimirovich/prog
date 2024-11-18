class bragin {
	public static void main(String args[]) {
		System.out.println("\n<\t<\t<\t<\tB R A G I N\t>\t>\t>\t>\t\n");
		System.out.println("#==============================================================================================================================#");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		long k = 0x7fffffffffffffffL;//9223372036854775807L;
		long l = 0x8000000000000000L;//-9223372036854775808L;
		int i = 0x7fffffff;//2147483647;
		int j = 0x80000000;//-2147483648;
		short s = 0x7fff;//32767;
		short h = -32768;
		byte a = 0x7f;//127;
		byte b = -128;
		double d1 = Double.longBitsToDouble(0x7fefffffffffffffL);//double null Double.longBitsToDouble(0x0000000000000000)
		double d2 = Double.longBitsToDouble(0xffefffffffffffffL);
		float f1 = Float.intBitsToFloat(0x7f7fffff);//float null Float.intBitsToFloat(0x00000000)
		float f2 = Float.intBitsToFloat(0xff7fffff);
		char c1 = 0x0000;
		char c2 = 0xffff;//65535;
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("|\tLong int 64 bit number between:\t\t" + k + "\tand\t" + l + "\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tInt 32 bit number between:\t\t" + i + "\tand\t" + j + "\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tShort int 16 bit number between:\t" + s + "\tand\t" + h + "\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tByte 8 bit number between:\t\t" + a + "\tand\t" + b + "\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tDouble 64 bit number between:\t\t" + d1 + "\tand\t" + d2 + "\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tFloat 32 bit number between:\t\t" + f1 + "\tand\t" + f2 + "\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tChar int 16 bit number between:\t\t" + (int)c1 + "\tand\t" + (int)c2 + "\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\tBoolean 1 bit value between:\t\t" + b1 + "\tand\t" + b2 + "\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |");
		System.out.println("#==============================================================================================================================#");
		System.out.println("\n<\t<\t<\t<\tE N D\t>\t>\t>\t>\t\n");
		System.out.printf("\n\n\t" + (1 + 1));
		/*
		System.out.printf("\n\n\t%f\n\n",f1);
		System.out.printf("\n\n\t%f\n\n",f2);
		System.out.printf("\n\n\t%f\n\n",d1);
		System.out.printf("\n\n\t%f\n\n",d2);
		for (int z=32; z<127; z++)
			System.out.print(" " + (char)z);
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\t1 2 3 4 5 6 7 8 1 2 3 4 5 6 7 8 1 2 3 4 5 6 7 8 1 2 3 4 5 6 7 8");
		System.out.println("\t! \" # % $ & ' ( ) * + , - . / : ; < = > ? @ [ \\ ] ^ _ ` { | } ~");
		//System.out.printf("# $ %");
		//System.out.printf("	, - . / : ; < = > ? @ [ \\ ] ^ _ ` { | } ~");
		System.out.println("\n");
		System.out.println("\t0 1 2 3 4 5 6 7 8 9");
		System.out.println("\n");
		System.out.println("\tA B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		System.out.println("\n");
		System.out.println("\ta b c d e f g h i j k l m n o p q r s t u v w x y z");
		System.out.println("\n");
		*/
	}
}
