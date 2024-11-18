class AccessDemo {
	private int alpha;
	public int beta;
	int gamma;
	//method for private value
	void setAlpha(int a){
		if(a <=100)
			alpha = a;
		else
			System.out.println("\n\tValue change not allowed\n");
	}
	int getAlpha() {
		return alpha;
	}
}
class FailSoftArray {
	private int [] a;
	private int errval;
	public int length;
	public FailSoftArray(int size, int errv) {
		a = new int [size];
		errval = errv;
		length = size;
	}
	public int get(int index) {
		if(indexOK(index))
			return a[index];
		else
			return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		else
			return false;
	}
	private boolean indexOK(int index) {
		if(index >= 0 & index < length)
			return true;
		else
			return false;
	}
}
class mod {
	public static void main ( String [] args ) {
		System.out.println("\n\tSTART\n");
		System.out.println("\n\tArgs:\t" + args);
		AccessDemo ad = new AccessDemo();
		//ad.alpha = 1;
		ad.beta = 1;
		ad.gamma = 1;
		ad.setAlpha(101);
		System.out.println("\n\talpha:\t:" + ad.getAlpha());
		ad.setAlpha(100);
		System.out.println("\n\talpha:\t:" + ad.getAlpha());
		System.out.println("\n\tFunction stopped\n");
		//secured array
		FailSoftArray fs = new FailSoftArray(5,-1);
		int x;
		System.out.println("\n\tFailSoftArray:");
		for(int i = 0; i < (fs.length *2);i++)
			fs.put(i,i*10);
		for(int i = 0; i < (fs.length *2);i++) {
			x = fs.get(i);
			if(x != -1)
				System.out.println(" " + x);
		}
		System.out.println("\n\tFailSoftArray with error:");
		for(int i = 0; i < (fs.length *2);i++)
			if(!fs.put(i,i*10))
				System.out.println("Error" + i);
		for(int i = 0; i < (fs.length *2);i++) {
			x = fs.get(i);
			if(x != -1)
				System.out.println(" " + x);
			else
				System.out.println("Error" + i);
		}
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tEND\n");
	}
}
