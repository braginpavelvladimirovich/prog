class su {
	private int sum;
	< A extends Number > su ( A arg ) {
		sum = 0 ;
		for ( int i = 0 ; i <= arg.intValue() ; i++ )
			sum += i ;
	}
	int gs ( ) {
		return sum ;
	}
}
class gc {
	public static void main ( String [ ] args ) {
		System.out.println("\n\tSTART\t\n");
		su ob = new su ( 4.0 );
		System.out.println("\n\tSummation result:\t" + ob.gs());
		System.out.println("\n\tEND\t\n");
	}
}
