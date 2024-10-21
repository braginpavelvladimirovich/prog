class pr002 {
	public static void main(String args[])
		throws java.io.IOException {
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
			}
	}
}	
