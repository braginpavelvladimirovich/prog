//queue
class q {
	char[] c;
	int putloc, getloc; //index rof move char
	q(int size) {
		c = new char[size]; //memory for q
		putloc=getloc=0;
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
		if(getloc=putloc) {
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
		for(i=0;i<25;i++)
			bigq.put((char) ('A' + i));
		System.out.println("\n\tqueue in big queue:\t");
		for(i=0;i<25;i++) {
			ch = bigq.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n\tEND FUNCTION\n");
		System.out.println("\n\tEND\n");
	}
}
