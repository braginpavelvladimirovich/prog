class tds {
	double width;
	double height;
	void sd() {
		System.out.println("\n\tdimesions:\t" + width + "\tx\t" + height);
	}
}
class t extends tds {
	String s;
	double area() {
		return width * height / 2 ;
	}
	void ss() {
		System.out.println("\n\tstyle:\t" + s);
	}
}
class r extends tds {
	String o;
	double area() {
		return width * height ;
	}
}
class i {
	public static void main(String[] args) {
		tds f1 = new tds();
		t t1 = new t();
		t t2 = new t();
		r r1 = new r();
		r r2 = new r();
	}
}
