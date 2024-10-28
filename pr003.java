class pr003 {
	public static void main(String[] args)
		throws java.io.IOException {
		char c;
		System.out.println("info about operators");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println("enter number: ");
		c = (char) System.in.read();
		System.out.println("\n");
		switch (c) {
			case '1':
				System.out.println("\topertor \"if\":\n");
				System.out.println("\tif operator; or {block operators}");
				System.out.println("\telse operator; or {block operators}");
				break;
			case '2':
				System.out.println("\topertor \"switch\":\n");
				System.out.println("\tswitch operator {");
				System.out.println("\t\tcase \"constant\"");
				System.out.println("\t\t\toperators");
				System.out.println("\t\t\tbreak;");
				System.out.println("\t\t// ...");
				System.out.println("\t}");
				break;
			default:
				System.out.println("\terror");
				break;
		}
	}
}
