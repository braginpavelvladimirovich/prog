//bubble sort
class bs {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\n");
		int[] nums = {9,8,2,3,4,5,6,7,1,0};
		int a,b,t,size=10;
		System.out.print("\tArray:\t");
		for(int i=0;i<size;i++)
			System.out.print(" " + nums[i]);
		System.out.println("\n\n\tEND FUNCTION\n");
		//sort
		int inn=0,out=0;
		for(a=1;a<size;a++) {
			out++;
			System.out.println("iteration:\t" + out + " outer cicle");
			for(b=size-1;b>=a;b--) {
				inn++;
				System.out.println("iteration:\t" + inn + " inner cicle");
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		t=inn+out;
		System.out.println("\n\n\tTotal cicle:\t" + t);
		System.out.print("\tArray sorted:\t");
		for(int i=0;i<size;i++)
			System.out.print(" " + nums[i]);
		System.out.println("\n\n\tEND FUNCTION\n");
		System.out.println("\n\tEND\n");
	}
}
