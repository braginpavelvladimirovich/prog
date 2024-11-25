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
class recu {
	public static void main(String[] args) {
		f ff = new f();
		System.out.println("factorial 3:\t" + ff.factr(3));
		System.out.println("factorial 3:\t" + ff.factr(4));
		System.out.println("factorial 3:\t" + ff.factr(5));
		System.out.println("factorial 3:\t" + ff.facti(3));
		System.out.println("factorial 3:\t" + ff.facti(4));
		System.out.println("factorial 3:\t" + ff.facti(5));
	}
}
