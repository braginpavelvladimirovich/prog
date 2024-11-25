class overload {
	int s;
	overload() {
		System.out.println("\n\tin constructor w/o param\n");
		s=0;
	}
	overload(int i) {
		System.out.println("\n\tin constructor 1 param\n");
		s=i;
	}
	overload(double i) {
		System.out.println("\n\tin constructor 1 param\n");
		s = (int) i;
	}
	overload(int i, int j) {
		System.out.println("\n\tin constructor 2 param\n");
		s = i + j;
	}
	void ovldemo() {
		System.out.println("\n\tSTART\n");
		System.out.println("\n\tno parameter\n");
	}
	void ovldemo(int a) {
		System.out.println("\n\tone paratmeter type int:\t" + a);
	}
	int ovldemo(int a, int b) {
		System.out.println("\n\ttwo paratmeter type int:\t" + a + "\t" + b);
		return a+b;
	}
	double ovldemo(double a,double b) {
		System.out.println("\n\ttwo paratmeter type double:\t" + a + "\t" + b);
		return a+b;
	}
	void f(int x) {
		System.out.println("\n\tf int:\t" + x);
	}
	void f(double x) {
		System.out.println("\n\tf double:\t" + x);
	}
	void f(byte x) {
		System.out.println("\n\tf byte:\t" + x);
	}
}
class overl {
	public static void main (String [] args) {
		overload ob = new overload();
		int i;
		double d;
		System.out.println("\n\tob.ovldemo();\n");
		ob.ovldemo();
		System.out.println("\n\ti = ob.ovldemo(3,7);\n");
		i = ob.ovldemo(3,7);
		ob.ovldemo(6);
		System.out.println("\n\tob.ovldemo(6);\n");
		d = ob.ovldemo(3.5,8.5);
		ob.ovldemo();
		System.out.println("\n\td = ob.ovldemo(3.5,8.5);\n");
		int i2 =10;
		double d2 = 99.9;
		byte b =30;
		short s =23;
		float f=11.2f;
		ob.f(i2);
		ob.f(d2);
		ob.f(b);
		ob.f(s);
		ob.f(f);
		overload t1 = new overload();
		overload t2 = new overload(3);
		overload t3 = new overload(25.5);
		overload t4 = new overload(5,7);
		System.out.println("\n\tobj\t" + t2.s);
		System.out.println("\n\tobj\t" + t2.s);
		System.out.println("\n\tobj\t" + t3.s);
		System.out.println("\n\tobj\t" + t4.s);
		
		System.out.println("\n\tEND\n");
	}
}
