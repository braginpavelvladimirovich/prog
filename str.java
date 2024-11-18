class str {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\n");
		String str1 = new String("String#1");
		String str2 = new String(str1);
		String str3 = "String#3";
		System.out.println("\n\t" +str1 + "\n\t" + str2 + "\n\t" +str3 + "\n\t");
		System.out.println("\n\tFunction stopped\n");
		//string method
		//1. equal boolean equals
		boolean eq = false;
		eq = str1.equals(str2);
		System.out.println("\teauals str1 and str2:\t" + eq);
		eq = str1.equals(str3);
		System.out.println("\teauals str1 and str3:\t" + eq);
		eq = str2.equals(str3);
		System.out.println("\teauals str2 and str3:\t" + eq);
		System.out.println("\n\tFunction stopped\n");
		//2.method length() string int
		int l = str1.length();
		System.out.println("\tlength str1:\t" + l);
		System.out.println("\n\tFunction stopped\n");
		//3. get char drom string charadd(index)
		char c;
		c = str1.charAt(3);
		System.out.println("\tchar at index 3 str1:\t" + c);
		System.out.println("\n\tFunction stopped\n");
		for(int i=0; i<str1.length();i++)
			System.out.println(str1.charAt(i));
		System.out.println("\n\tFunction stopped\n");
		//4. equals strings numbers differencei
		System.out.println("\n\tEquals str1 and str2:\t" + str1.compareTo(str2));
		System.out.println("\n\tEquals str1 and str1:\t" + str1.compareTo(str3));
		System.out.println("\n\tFunction stopped\n");
		//5. first index
		System.out.println("\n\tPrint str1 index:\t" + str1.indexOf(str1));
		System.out.println("\n\tPrint str2 index:\t" + str1.indexOf(str2));
		System.out.println("\n\tPrint str3 index:\t" + str1.indexOf(str3));
		System.out.println("\n\tFunction stopped\n");
		//6. search index
		str1 = "minecraft use java";
		str2 = "java";
		str3 = "e";
		System.out.println("\n\tPrint str1-1 index:\t" + str1.lastIndexOf(str1));
		System.out.println("\n\tPrint str1-2 index:\t" + str1.lastIndexOf(str2));
		System.out.println("\n\tPrint str1-3 index:\t" + str1.lastIndexOf(str3));
		System.out.println("\n\tPrint str2-3 index:\t" + str2.lastIndexOf(str3));
		System.out.println("\n\tFunction stopped\n");
		//7. string array
		String[] str0 = {str1,str2,str3};
		System.out.println("\n\tstring array:\t" + str0 + "\n\t");
		for(String s :str0)
			System.out.print(" " + s);
		System.out.println("\n\tFunction stopped\n");
		//8. create understring
		String sub = str1.substring(5,8);
		System.out.println("\n\tsubstring:\t" + sub);
		System.out.println("\n\tFunction stopped\n");
		//9. control switch with string
		String command ="cancel";
		switch(command) {
			case "connect":
				System.out.println("\n\tconnect\n");
				break;
			case "disconnect":
				System.out.println("\n\tdisconnect\n");
				break;
			case "cancel":
				System.out.println("\n\tcancel\n");
				break;
			default:
				System.out.println("\n\tdefault\n");
				break;
		}
		System.out.println("\n\tFunction stopped\n");
		//10. text block
		String block = """
			\n\tstange
			\tformat
			\t"string"
			""";
		System.out.println("\n\tstring block:\t" + block);
		System.out.println("\n\tFunction stopped\n");
		//11. args
		System.out.println("\n\tArgs:\t" + args + args.length);
		for(int i=0;i<args.length;i++)
			System.out.println("\tArguments:\t" + args[i]);
		System.out.println("\n\tFunction stopped\n");
		//12. 2 dimesion array string
		String[][] str4 = {
			{"first","qwertyuiop"},
			{"second","asdfghjkl"},
			{"third","zxcvbnm"},
			{"quatro","1234567890"}
		};
		int i;
		if(args.length !=1)
			System.out.println("\n\thave args\n");
		else {
			for(int i=0;i<str4.length;i++) {
				if(str4[i][0].equals(args[0])) {
					System.out.println(str4[i][0]);
				}
			}
			if(i==str4.length)
				System.out.println("\n\tnot found\n");
		}
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tEND\n");
	}
}
