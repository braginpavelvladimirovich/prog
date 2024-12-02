class tds {
	private double width;
	private double height;
	String n;
	tds(double w, double h) {
		width = w;
		height = h;
		n = "Two Dimesion Shape";
	}
	void sd() {
		System.out.println("\n\tdimesions:\t" + width + "\tx\t" + height);
	}
	double gw() {
		return width;
	}
	double gh() {
		return height;
	}
}
class t extends tds {
	String st;
	t(String s, double w, double h){
		super(w,h);
		st = s;
		n = "Triangle";
	}
	double area() {
		return gw() * gh() / 2 ;
	}
	void ss() {
		System.out.println("\n\tstyle:\t" + st);
	}
}
class r extends tds {
	String ol;
	r(String o, double w, double h){
		super(w,h);
		ol = o;
		n = "Rectangle";
	}
	double area() {
		return gw() * gh() ;
	}
	boolean is() {
		if (gw()==gh())
			return true;
		else
			return false;
	}
}
class i {
	public static void main(String[] args) {
		tds f1 = new tds(20.0, 30.0);
		t t1 = new t("asd",4.5,7.0);
		t t2 = new t("contur",3.5,8.0);
		r r1 = new r("line",5.0,5.0);
		r r2 = new r("punkt",5.0,7.0);
		System.out.println("info:");
		System.out.println("f1:\t" + f1.n);
		f1.sd();
		System.out.println("t1:\t" + t1.n);
		t1.ss();
		System.out.println("area:\t" + t1.area());
		System.out.println("t2:\t" + t2.n);
		t2.ss();
		System.out.println("area:\t" + t2.area());
		System.out.println("r1:\t" + r1.n);
		System.out.println("square?:\t" + r1.is());
		System.out.println("area:\t" + r1.area());
		System.out.println("r2:\t" + r2.n);
		System.out.println("square?:\t" + r2.is());
		System.out.println("area:\t" + r2.area());
		//System.out.println(f1.width);
		//System.out.println(t1.width);
	}
}
