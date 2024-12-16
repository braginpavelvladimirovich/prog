class gm {
	static < A extends Comparable < A > , B extends A > boolean ae ( A [ ] x , B [ ] y ) {
		if ( x.length != y.length )
			return false;
		for ( int i = 0 ; i < x.length ; i++ )
			if ( !x[i].equals(y[i]))
				return false;
		return true;
	}
	public static void main ( String [ ] args ) {
		System.out.println("\n\tSTART\t\n");
		Integer [ ] n = { 1 , 2 , 3 , 4 } ;
		Integer [ ] n2 = { 1 , 2 , 3 , 4 } ;
		Integer [ ] n3 = { 1 , 2 , 3 , 4 , 5 } ;
		Integer [ ] n4 = { 1 , 3 , 2 , 4 , 5 } ;
		String [ ] s = { " 0 1 2 3 " , " 0 1 2 3 " , " 0 1 2 3 4 " , " 0 1 3 2 4 " };
		String [ ] s2 = { " 0 1 2 3 " , " 0 1 2 3 " , " 0 1 2 3 4 " , " 0 1 3 2 4 " };
		String [ ] s3 = { " 0 1 2 3 " , " 0 1 2 3 " , " 0 1 2 3 4 " , " 0 2 2 2 4 " };
		if ( ae(s3 , s2))
			System.out.println("\n\tEQUAL\t\n");
		else
			System.out.println("\n\tNOT EQUAL\t\n");
		System.out.println("\n\tEND\t\n");
	}
}
