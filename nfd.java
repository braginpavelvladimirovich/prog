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
	boolean ae(nf < ? > ob) {
		if ( Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
/*
 * restrict lasses by nasledvanie
 * class pair < A , B extends A > {
 * ...
 * }
*/
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
		//nf < String > sob;
		//sob = new nf < > ( "str" ) ;
		System.out.println ( "\n\tEND\t\n" );
		nf < Integer > iob2;
		iob2 = new nf < > ( 7 ) ;
		nf < Double > dob2;
		dob2 = new nf < > ( -7.0 ) ;
		if (iob2.ae(dob2))
			System.out.println ( "\n\tEqual\t\n" );
		else
			System.out.println ( "\n\tNOT Equal\t\n" );
	}
}
