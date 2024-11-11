///work with arrays
class arrays {
	public static void main (String [] args) {
		System.out.println("\n\tSTART\n");
	int [] nums = new int[10];
	//fill array numbers
	for (int i = 0; i < 10; i++) {
		for(int temp=0;temp <i;temp++)
			nums[i] = i * i;
	}
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
	for (int i = 0; i < nums.length; i++) {
		if(nums[i] < min) min = nums[i];
		if(nums[i] > max) max = nums[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	//alteranative
	max = min = 0;
	int x = 10;
	int[] nums1 = {0,1,2,3,4,5,6,7,8,9};
	for (int i = 0; i < nums1.length; i++)
		System.out.println("\tarray number in [" + i + "]:" + nums1[i]);
	System.out.println("\n\tEND FUNCTION\n");
	for (int i = 0; i < nums1.length; i++) {
		if(nums1[i] < min) min = nums1[i];
		if(nums1[i] > max) max = nums1[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	//double arrays
	int t,j;
	int[][] table = new int [3][4];
	for(t=0;t<table.length;t++) {
		for(j=0;j<table[t].length;j++) {
			table[t][j] = (t*4) + j + 1;
			System.out.print(table[t][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("\n\tEND FUNCTION\n");
	// square array
	int[][] riders = new int [7][];
	riders[0] = new int[10];
	riders[1] = new int[10];
	riders[2] = new int[10];
	riders[3] = new int[10];
	riders[4] = new int[10];
	riders[5] = new int[2];
	riders[6] = new int[2];
	System.out.println("\n\tworkddays\n");
	for (int i = 0; i < 5; i++)
		for(int k=0;k<10;k++)
			riders[i][k] = i + k + 10;
	for (int i = 5; i < 7; i++)
		for(int k=0;k<2;k++)
			riders[i][k] = i + k + 10;
	for(t=0;t<5;t++) {
		for(j=0;j<10;j++) {
			System.out.print(riders[t][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("\n\tvocayions\n");
	for(t=5;t<7;t++) {
		for(j=0;j<2;j++) {
			System.out.print(riders[t][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("\n\tEND FUNCTION\n");
	int[][] sqrs = {
		{1,1},
		{2,4},
		{3,9},
		{4,16},
		{5,25},
		{6,36},
		{7,49},
		{8,64},
		{9,81},
		{10,100}
	};
	System.out.println("\n\tsquare array\n");
	for(t=0;t<sqrs.length;t++) {
		for(j=0;j<sqrs[t].length;j++) {
			System.out.print(sqrs[t][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("\n\tEND FUNCTION\n");
	//declarations int[] x= new x[]
	//alt int x[]= new x[]
	//link to array
	int[] nums2 = new int[10];
	int[] nums3 = new int[11];
	for (int i = 0; i < 10; i++){
		nums2[i] = i;
		nums3[i] = -i;
	}
	System.out.println("\n\tnumbers 2\n");
	for (int i = 0; i < nums2.length; i++)
		System.out.print(nums2[i] + "\t");
	System.out.println();
	System.out.println("\n\tnumbers 3\n");
	for (int i = 0; i < nums3.length; i++)
		System.out.print(nums3[i] + "\t");
	System.out.println();
	nums2[3] = 99;
	System.out.println("\n\tchanged numbers 2\n");
	for (int i = 0; i < nums2.length; i++)
		System.out.print(nums2[i] + "\t");
	System.out.println();
	System.out.println("\n\tnumbers 3\n");
	for (int i = 0; i < nums3.length; i++)
		System.out.print(nums3[i] + "\t");
	System.out.println();
	nums3=nums2;
	nums3[3]=-88;
	System.out.println("\n\tlink numbers 2| nums2 and nums3 is one array\n");
	for (int i = 0; i < nums2.length; i++)
		System.out.print(nums2[i] + "\t");
	System.out.println();
	System.out.println("\n\tEND FUNCTION\n");
	//peremennaya ekzemplyara length
	int[] list = new int[10];
	int[] nums4 = {1,2,3};
	int[][] table1 = {
		{7,8,9},
		{5,6},
		{1,2,3,4},
		{0}
	};
	System.out.println("\n\tlength list:\t" + list.length);
	System.out.println("\n\tlength table1:\t" + table1.length);
	System.out.println("\n\tlength table1[0]:\t" + table1[0].length);
	System.out.println("\n\tlength table1[1]:\t" + table1[1].length);
	System.out.println("\n\tlength table1[2]:\t" + table1[2].length);
	System.out.println("\n\tlength table1[3]:\t" + table1[3].length);
	System.out.println("\n\tlength nums4:\t" + nums4.length);
	System.out.println("\n\tEND FUNCTION\n");
	int[] nums5 = {0,1,2,3,4,7,8,9};
	int sun = 0;
	for(int x : nums) {
		System.out.println("value x:\t" + x);
		sum += x;
	}
	System.out.println("\n\tsum of elements\t" + sum);
	System.out.println("\n\tEND FUNCTION\n");
	System.out.println("\n\tEND\n");
	}
}
