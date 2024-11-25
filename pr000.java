//peredacha obj as args and return obj metod
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
class byref {
	int a,b;
	byref(int i, int j){
		a=i;
		b=j;
	}
	void change(byref ob) {
		ob.a = ob.a +ob.b;
		ob.b = -ob.b;
	}
}
class errormsg {
	String[] msgs = {
		"\terror print",
		"\terror input",
		"\terror disk",
		"\tout of index"
	};
	String geterrormsg(int i){
		if(i>=0 & i < msgs.length)
			return msgs[i];
		else
			return "\tunclear";
	}
}
class err {
	String msg;
	int sev;
	err(String m,int s) {
		msg = m;
		sev = s;
	}
}
class errorinfo {
	String[] msgs = {
		"\terror print",
		"\terror input",
		"\terror disk",
		"\tout of index"
	};
	int[] howbad = {3,3,2,4};
	err geterrorinfo(int i) {
		if(i >= 0 & i <msgs.length)
			return new err(msgs[i],howbad[i]);
		else
			return new err("\tunclear",0);
	}
}
class pr000 {
	public static void main(String[] args){
		System.out.println("\n\tSTART\n");
		System.out.println("\t12:21 PM 11/25/2024");
		System.out.println("\tнеделя номер 13");
		System.out.println("\tа. 308");
		System.out.println("\t16-я пара: 12.10 – 13.40;");
		System.out.println("\t17-я пара: 14.10 – 15.40;");
		System.out.println("\t18-я пара: 15.50 – 17.20;\n");
		block ob1 = new block(10,2,5);
		block ob2 = new block(10,2,5);
		block ob3 = new block(5,4,5);
		System.out.println("\tob1 and ob2 equal:\t" + ob1.sameblock(ob2));
		System.out.println("\tob1 and ob3 equal:\t" + ob1.sameblock(ob3));
		System.out.println("\tob1 and ob3 value equal:\t" + ob1.samev(ob3));
		byvalue ob4 = new byvalue();
		int a = 15, b =20;
		System.out.println("\tbefore:\t" + a + "\t" + b);
		ob4.nochange(a,b);
		System.out.println("\tnochange:\t" + a + "\t" + b);
		byref ob5 = new byref(15,20);
		System.out.println("\tob5 before:\t" + ob5.a + "\t" + ob5.b);
		ob5.change(ob5);
		System.out.println("\tob5 change:\t" + ob5.a + "\t" + ob5.b);
		System.out.println("\n\tEND FUNCTION\n");
		//demo return string by method
		errormsg err0 =new errormsg();
		System.out.println(err0.geterrormsg(2));
		System.out.println(err0.geterrormsg(-1));
		System.out.println("\n\tEND FUNCTION\n");
		//return obj
		errorinfo err2 = new errorinfo();
		err e;
		e = err2.geterrorinfo(3);
		System.out.println(e.msg + "\tseverity\t" + e.sev);
		e = err2.geterrorinfo(-1);
		System.out.println(e.msg + "\tseverity\t" + e.sev);
		System.out.println("\n\tEND FUNCTION\n");
		System.out.println("\n\tEND\n");
	}
}
