class block {
	private int a,b,c;
	private int v;
	public block(int i, int j, int k) {
		a = i;
		b=j;
		c=k;
		v=a*b*c;
	}
	public boolean sameblock(block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}
	public boolean samev(block ob) {
		if(ob.v == v)
			return true;
		else
			return false;
	}
}
class byvalue {
	void nochange(int i, int j) {
		i = i+j;
		j=-j;
	}
}
class pr000 {
	public static void main(String[] args){
		block ob1 = new block(10,2,5);
		block ob2 = new block(10,2,5);
		block ob3 = new block(5,4,5);
		System.out.println("ob1 and ob2 equal:\t" + ob1.sameblock(ob2));
		System.out.println("ob1 and ob3 equal:\t" + ob1.sameblock(ob3));
		System.out.println("ob1 and ob2 value equal:\t" + ob1.samev(ob2));
		byvalue ob4 = new byvalue();
		int a = 15, b =20;
		System.out.println("an before:\t" + a + "\t" + b);
		ob3.nochange(a,b);
		System.out.println("an before:\t" + a + "\t" + b);
	}
}
