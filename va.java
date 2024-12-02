class va {
	static void vatest(int ... v) {
		System.out.println("\n\tSTART\n");
		System.out.println("\n\targs:" + v.length);
		System.out.println("\n\tin:");
		for(int i=0; i < v.length; i++)
			System.out.println("\n\targ:"+i+"\t:\t"+v[i]);
	}
	public static void main(String[] args) {
		vatest();
		vatest(16);
		vatest(7,127,32767,2147483647);
	}
}
