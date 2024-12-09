package bp;
public class b {
	private String title;
	private String author;
	private int pd;
	b ( String t, String a, int d) {
		title=t;
		author=a;
		pd=d;
	}
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pd);
		System.out.println();
	}
}
