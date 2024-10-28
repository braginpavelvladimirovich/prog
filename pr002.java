class pr002 {
	public static void main(String args[])
		throws java.io.IOException {
		/*
		System.out.println("start there");
		int i = 10, j = 20;
		char c = 0, answer = 'R';
		boolean bool = true;
		c = (char) System.in.read();
		if (c == answer)
			System.out.println("tap letter");
		else {
			System.out.print("not that ");
			if (c > answer)
				System.out.println("lower than");
			else
				System.out.println("upper than");
		}
		System.out.println("enter symbol");
		for(int k=0; k<10; k++)
			switch(k) {
				case 0:
					System.out.println("k = 0");
					break;
				case 1:
					System.out.println("k = 1");
					break;
				case 2:
					System.out.println("k = 2");
					break;
				case 3:
					System.out.println("k = 3");
					break;
				case 4:
					System.out.println("k = 4");
					break;
				default:
					System.out.println("k = 5 or > 5");
					break;
			}
		if (!bool)
			System.out.println("bool is true");
		else
			System.out.println("bool is false");
		System.out.println("\n");
		*/
		//operator for ( initialize; usloviea; changes )
		for(int a=0, b=10; a<b; a++, b--)
			System.out.println("i & j: " + a + " " + b);
		for(int a=0; a<10;) {
			System.out.println("a is: " + a);
			a++;
		}
	}
}	
