class f {
	void select(int i) {
		switch (i) {
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
			case '3':
				System.out.println("\toperator cycle \"for\":");
				System.out.println("\tfpr(initialization;condition;action");
				System.out.println("\t\toperator; or {block opertors}");
				break;
			case '4':
				System.out.println("\toperator cycle \"while\":");
				System.out.println("\twhile(condition) { operators}");
				break;
			case '5':
				System.out.println("\toperator cycle \"do while\":");
				System.out.println("\tdo {");
				System.out.println("\t\toperators");
				System.out.println("\t} while(condition)");
				System.out.println("\tdo\n\tdo hast\n\tdo hast mich\n\tdo hast mich gefraht\n\tdo hast mich gefraht und ich hab nich gesaht\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				break;
			case '6':
				System.out.println("\tbreak");
				break;
			case '7':
				System.out.println("\tcontinue");
				break;
			default:
				System.out.println("\terror");
				break;
		}
		System.out.println("\t");
	}
	void menu() {
		System.out.println("info about operators");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do while");
		System.out.println("\t6. break");
		System.out.println("\t7.continue");
		System.out.println("enter number or q for quit: ");
	}
	boolean v(int c) {
		if(c < 1 | c > '7' & c != 'q')
			return false;
		else
			return true;
	}
}
class pr003 {
	public static void main(String[] args)
		throws java.io.IOException {
		char c, cc;
		f select = new f();
		for(;;) {
			do {
				select.menu();
				c = (char) System.in.read();
				do {
					cc = (char) System.in.read();
				} while (cc != '\n');
			if (c == 'q') break;
			System.out.println("\t\n");
			} while(!select.v(c));


		}
	}
}
