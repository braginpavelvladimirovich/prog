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
	double area() {
		System.out.println("\n\tmethod need to change\t");
		return 0.0;
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
	String ssn() {
		return super.n;
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
class ct extends t {
	String co;
	ct(String c, String s, double w, double h) {
		super(s, w, h);
		co = c;
		n = "COLORE";
	}
	void sc() {
		System.out.println("\tCOLORE:\t" + co);
	}
}
class i {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\t\n");
		tds f1 = new tds(20.0, 30.0);
		t t1 = new t("\tasd\t",4.5,7.0);
		ct t2 = new ct("\tRED\t","\tcontur\t",3.5,8.0);
		r r1 = new r("\tline\t",5.0,5.0);
		r r2 = new r("\tpunkt\t",5.0,7.0);
		System.out.println("\tinfo:\t");
		System.out.println("\tf1:\t" + f1.n);
		f1.sd();
		System.out.println("\tt1:\t" + t1.n);
		t1.ss();
		t1.ssn();
		System.out.println("\tarea:\t" + t1.area());
		System.out.println("\tt2:\t" + t2.n);
		t2.ss();
		t2.ssn();
		System.out.println("\tarea:\t" + t2.area());
		System.out.println("\tr1:\t" + r1.n);
		System.out.println("\tsquare?:\t" + r1.is());
		System.out.println("\tarea:\t" + r1.area());
		System.out.println("\tr2:\t" + r2.n);
		System.out.println("\tsquare?:\t" + r2.is());
		System.out.println("\tarea:\t" + r2.area());
		System.out.println("\n\tSTOP FUNCTION\t\n");
		//System.out.println(f1.width);
		//System.out.println(t1.width);
		//vakue superclass can link on object any sublcass
		System.out.println("\twidth:\t" + f1.gw());
		f1.area();
		f1 = t1;
		System.out.println("\twidth:\t" + f1.gw());
		System.out.println("\tarea:\t" + f1.area());
		f1 = r1;
		System.out.println("\twidth:\t" + f1.gw());
		System.out.println("\tarea:\t" + f1.area());
		System.out.println("\n\tSTOP FUNCTION\t\n");
		f1 = t2;
		t2.sc();
		System.out.println("\tarea:\t" + f1.area());
		System.out.println("\n\tSTOP FUNCTION\t\n");
		System.out.println("\tname:\t" + f1.name);
		System.out.println("\n\tSTOP FUNCTION\t\n");
		System.out.println((int)0x7fffffff);
		System.out.println(Float.intBitsToFloat(0x7f7fffff));
		System.out.println((int)Float.intBitsToFloat(0x7f7fffff)==(int)0x7fffffff);
		System.out.println((int)Float.intBitsToFloat(0xff7fffff)==(int)0x80000000);
		System.out.println(Float.intBitsToFloat((int)0x7fffffff));
		System.out.println(Float.intBitsToFloat((int)0x80000000));
		System.out.println("\n\tSTOP FUNCTION\t\n");
		System.out.println("\n\tEND\t\n");
	}
}
