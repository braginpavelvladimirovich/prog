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
		System.out.println("\n\tEND\n");
	}
}
