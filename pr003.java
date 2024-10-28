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
				System.out.println("opertor \"if\":\n");
				System.out.println("if operator; or {block operators}");
				System.out.println("else operator; or {block operators}");
				break;
			case '2':
				System.out.println("opertor \"switch\":\n");
				System.out.println("switch operator {");
				System.out.println(" case \"constant\"");
				System.out.println("  operators");
				System.out.println("  break;");
				System.out.println(" // ...");
				System.out.println("}");
				break;
			default:
				System.out.println("error");
				break;
		}
	}
}
