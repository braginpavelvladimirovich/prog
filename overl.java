class overload {
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
	}
}
