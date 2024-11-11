///work with arrays
class arrays {
	public static void main (String [] args) {
		System.out.println("\n\tSTART\n");
	int [] nums = new int[10];
	//fill array numbers
	for (int i = 0; i < 10; i++)
		nums[i] = i * i;
	//print out array
	for (int i = 0; i < 10; i++)
		System.out.println("\tarray number in [" + i + "]:" + nums[i]);
	System.out.println("\n\tEND FUNCTION\n");
	nums[0] = 2147483647;
	nums[1] = -2147483648;
	nums[2] = 32767;
	nums[3] = -32768;
	nums[4] = 127;
	nums[5] = -128;
	nums[6] = 65535;
	nums[7] = 0;
	nums[8] = 1;
	nums[9] = -1;
	int min, max;
	min = max = nums[0];
	for (int i = 0; i < 10; i++) {
		if(nums[i] < min) min = nums[i];
		if(nums[i] < max) max = nums[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	//alteranative
	int x = 10;
	int[] nums1 = {0,1,2,3,4,5,6,7,8,9};
	for (int i = 0; i < 10; i++)
		System.out.println("\tarray number in [" + i + "]:" + nums1[i]);
	System.out.println("\n\tEND FUNCTION\n");
	for (int i = 0; i < 10; i++) {
		if(nums1[i] < min) min = nums1[i];
		if(nums1[i] < max) max = nums1[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	System.out.println("\n\tEND\n");
	}
}
