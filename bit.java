class bit {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\n");
		char c;
		System.out.println("\n\tchange regist character:\n");
		for(int i=0;i<25;i++) {
			c = (char)('a'+i);
			System.out.print(c);
			c = (char)((int)c&65503);
			System.out.print(c+" ");
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tEND\n");
	}
}
