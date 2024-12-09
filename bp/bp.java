package bp;
class b {
	private String title;
	private String author;
	private int pd;
	b ( String t, String a, int d) {
		title=t;
		author=a;
		pd=d;
	}
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pd);
		System.out.println();
	}
}
class bd {
	public static void main(String[] args) {
		b[] bk = new b[4];
		bk[0] = new b ("book 0","author 0",0000);
		bk[1] = new b ("book 1","author 1",0001);
		bk[2] = new b ("book 2","author 2",0002);
		bk[3] = new b ("book 3","author 3",0003);
		for(int i=0; i < bk.length;i++)
			bk[i].show();
	}
}
