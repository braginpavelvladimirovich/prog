class f {
	int factr(int n) {
		int result;
		if(n==1)
			return 1;
		result = factr(n-1) *n;
		return result;
	}
	int facti(int n) {
		int t, result;
		result =1;
		for(t=1;t<=n;t++)
			result *= t;
		return result;
	}
}
class sd {
	int x;
	static int y;
	int sum() {
		return x+y;
	}
}
class sm {
	static int val = 1024;
	static int vd() {
		return val/2;
	}
}
class sb {
	static double r2;
	static double r3;
	static {
		System.out.println("in static bock");
		r2=Math.sqrt(2.0);
		r3=Math.sqrt(3.0);
	}
	sb(String msg) {
		System.out.println(msg);
	}
}
class recu {
	public static void main(String[] args) {
		f ff = new f();
		for(int i=1;i<10;i++){
			System.out.println("facttorial " + i + " R\t" + ff.factr(i));
			System.out.println("facttorial " + i + " I\t" + ff.facti(i));
		}
		//statical obj
		sd ob1 = new sd();
		sd ob2 = new sd();
		ob1.x=10;
		ob2.x=20;
		System.out.println("ob1.x=\t" + ob1.x);
		System.out.println("ob2.x=\t" + ob2.x);
		sd.y =19;
		System.out.println("sd.y=\t" + sd.y);
		System.out.println("ob1.sum():\t" + ob1.sum());
		System.out.println("ob2.sum():\t" + ob2.sum());
		sd.y =190;
		System.out.println("sd.y=\t" + sd.y);
		System.out.println("ob1.sum():\t" + ob1.sum());
		System.out.println("ob2.sum():\t" + ob2.sum());
		System.out.println("static methomd division value\t" + sm.val);
		System.out.println("static methomd division value\t" + sm.vd());
		sm.val = 2;
		System.out.println("static methomd division value\t" + sm.val);
		System.out.println("static methomd division value\t" + sm.vd());
		sb ob = new sb("in cons");
		System.out.println("root of 2\t" + sb.r2);
		System.out.println("root of 3\t" + sb.r3);
	}
}
