//queue
class q {
	private char[] c;
	private int putloc, getloc; //index rof move char
	q(int size) {
		c = new char[size]; //memory for q
		putloc=getloc=0;
	}
	q(q ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		c = new char[ob.c.length];
		for(int i=getloc; i<putloc; i++)
			c[i]=ob.c[i];
	}
	q(char[] a) {
		putloc = 0;
		getloc = 0;
		c = new char[a.length];
		for(int i=0; i<a.length; i++)
			put(a[i]);
	}
	//method for make char tu q
	void put(char ch) {
		if(putloc==c.length) {
			System.out.println("\n\tqueue is full\n");
			return;
		}
		c[putloc++] = ch;
	}
	char get() {
		if(getloc==putloc) {
			System.out.println("\n\tqueue is empty\n");
			return (char) 0;
		}
		return c[getloc++];
	}
}
class qdemo {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\n");
		q bigq = new q(100);
		q smallq = new q(4);
		char ch;
		int i;
		System.out.println("\n\tsave alphabet to big queue\n");
		for(i=0;i<26;i++)
			bigq.put((char) ('A' + i));
		System.out.println("\n\tqueue in big queue:\t");
		for(i=0;i<26;i++) {
			ch = bigq.get();
			if(ch != (char) 0)
				System.out.print(" " + ch);
		}
		System.out.println("\n\tEND FUNCTION\n");
		System.out.println("\n\tsave alphabet to small queue\n");
		for(i=0;i<5;i++) {
			System.out.print("save:\t" + (char) ('Z' - i));
			smallq.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println("\n\tEND FUNCTION\n");
		System.out.println("\n\tget from small queue\n");
		for(i=0;i<5;i++) {
			ch =smallq.get();
			if(ch != (char) 0)
				System.out.print("\t" + ch);
		}
		System.out.println("\n\tEND FUNCTION\n");
		q q1 =new q(10);
		char[] chars={'A','B','C'};
		q q2 = new q(chars);
		for(i =0;i<10;i++)
			q1.put((char) ('D' +i));
		q q3 = new q(q1);
		System.out.println("\n\tqueue:\t");
		for(i =0;i<10;i++){
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n\tqueue:\t");
		for(i =0;i<3;i++){
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println("\n\tqueue:\t");
		for(i =0;i<10;i++){
			ch = q3.get();
			System.out.print(ch);
		}
		System.out.println("\n\tEND FUNCTION\n");
		System.out.println("\n\tEND\n");
		//try access to private value
		//bigQ.q[3]=1;
		//bigQ.putloc=1;
	}
}
