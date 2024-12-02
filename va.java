class va {
	static void vatest(int ... v) {
		System.out.println("\n\tSTART\n");
		System.out.println("\n\targs:" + v.length);
		System.out.println("\n\tin:");
		for(int i=0; i < v.length; i++)
			System.out.println("\n\targ:"+i+"\t:\t"+v[i]);
	}
	static void vatest(String msg, int ... v) {
		System.out.println("\n\tSTART\n");
		System.out.println("\n\targs:" + (v.length+1));
		System.out.println("\n\tString:\t" + msg);
		System.out.println("\n\tin:");
		for(int i=0; i < v.length; i++)
			System.out.println("\n\targ:"+i+"\t:\t"+v[i]);
	}
	public static void main(String[] args) {
		vatest("hello");
		vatest('A');
		vatest(1,2,4,8,16,32);
		vatest(1,1,7,127,32767,2147483647);
		vatest(0,0,1,16,4096,256);
	}
}
