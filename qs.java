import java.util.Random;
class qsm {
	static void qsort(char[] items) {
		qs(items, 0, items.length-1);
	}
	private static void qs(char[] items, int left, int right) {
		int i,j;
		char x,y;
		i=left;
		j=right;
		x=items[(left+right)/2];
		do {
			while((items[i] <x) && (i < right))
				i++;
			while((x < items[j]) && (j > left))
				j--;
			if(i <=j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		}
		while(i <= j);
		if(left <j) qs(items, left,j);
		if (i<right) qs(items, i , right);
	}
}
class qss {
	public static void main(String[] args) {
		Random rand = new Random();
		char[] b = new char[100000];
		char[] a = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		int i;
		System.out.println();
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
		qsm.qsort(a);
		System.out.println();
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
		for(i=0;i<b.length;i++){
			b[i]=(char) (rand.nextInt(26)+65);
		}
		System.out.println();
		qsm.qsort(b);
		for(i=0;i<b.length;i++)
			System.out.print(b[i]);
		System.out.println();
		System.out.println((int)'A');
		for(i=0;i<100;i++)
			System.out.print(b[i]);
	}
}
