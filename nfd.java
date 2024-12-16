class nf < A extends Number > {
	A num;
	nf ( A n ) {
		num = n;
	}
	double r() {
		return 1 / num.doubleValue();
	}
	double f() {
		return num.doubleValue() - num.intValue();
	}
}
class nfd {
	public static void main ( String [] args ) {
		nf ob;
		nf < Integer > iob;
		iob = new nf < > ( 5 ) ;
		nf < Double > dob;
		dob = new nf < > ( 5.2 ) ;
		ob = iob;
		System.out.println ( "\n\tvyvod:\t" + ob.r());
		System.out.println ( "\n\tvyvod:\t" + ob.f());
		ob = dob;
		System.out.println ( "\n\tvyvod:\t" + ob.r());
		System.out.println ( "\n\tvyvod:\t" + ob.f());
	}
}
