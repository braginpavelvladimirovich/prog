class pr002 {
	static int f() {
		System.out.println("call funk");
		return 0;
	}
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
		//operator for ( initialize; usloviea; changes )
		for(int a=0, b=10; a<b; a++, b--)
			System.out.println("\ti & j: " + a + " " + b);
		for(int a=0; a<32768;) {
			System.out.println("\ta is: " + a);
			a++;
		}
		//endless for(;;);
		int sum=0;
		for(int a=1; a<=5; sum += a++);
		System.out.println("\n\tsumma = " + sum);
		//while
		System.out.println("\n\twhile");
		char c='А';
		while(c <= 'я') {
			System.out.print(" " + c);
			c++;
		}
		System.out.println("\n\tyo: " + (int) 'ё' + "\tYO: " + (int) 'Ё');
		//do while
		do {
			System.out.println("\n\tEnter symbol");
			c = (char) System.in.read();
		} while(c != 'q');
		f();
		*/
		for(int a=0; a<2147483647; a++) {
			System.out.println("\tvalue a:\t" + a);
			if (a == 1)
				break;
			System.out.println("\tnext iteration");
		}
		System.out.println("\t");
		//insert cycle in break
		for(int i=0; i<3; i++) {
			System.out.println("\n\touter cycle:\t" + i);
			System.out.print("\tinner cycle:\t");
			int j = 0;
			while(j<128) {
				if(j==16)
					break;
				System.out.print("\t" + j);
				j++;
			}
		}
		System.out.println("\t");
		int ii;
		for(ii=1; ii<4; ii++) {
one:{
two:{
three:{
	      System.out.println("\tii =\t" + ii);
	      if(ii==1) break one;
	      if(ii==2) break two;
	      if(ii==3) break three;
	      System.out.println("\tbreak");
}
System.out.println("\tthree end");}
System.out.println("\ttwo end");}
System.out.println("\tone end");
		}
System.out.println("\tfor end");
		//break label
		System.out.println("\t");
done:
		for(int i=0; i<2147483647; i++) {
			for(int j=0; j<2147483647; j++) {
				for(int k=0; k<2147483647; k++) {
					System.out.println("\t"+ k);
					if(k==8) break done;
				}
				System.out.println("\tend k");
			}
			System.out.println("\tend j");
		}
	System.out.println("\tend i");
	//operator cntinue
value:
	for(int i=0; i<=65536; i++) {
		if((i%2) != 0)
			continue value;
		System.out.println("\t" + i);
	}
	System.out.println("\t2+2=" + 2+2);
	System.out.println("\t2*2=" + 2*2);
	System.out.println("\t\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}	
