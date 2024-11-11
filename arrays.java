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
	for (int i = 0; i < 10; i++) {
		if(nums[i] < min) min = nums[i];
		if(nums[i] > max) max = nums[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	//alteranative
	max = min = 0;
	int x = 10;
	int[] nums1 = {0,1,2,3,4,5,6,7,8,9};
	for (int i = 0; i < 10; i++)
		System.out.println("\tarray number in [" + i + "]:" + nums1[i]);
	System.out.println("\n\tEND FUNCTION\n");
	for (int i = 0; i < 10; i++) {
		if(nums1[i] < min) min = nums1[i];
		if(nums1[i] > max) max = nums1[i];
	}
	System.out.println("\n\tMinimun is:\t" + min + "\n\tMaximum is:\t" + max);
	System.out.println("\n\tEND FUNCTION\n");
	//double arrays
	int t,j;
	int[][] table = new int [3][4];
	for(t=0;t<3;t++) {
		for(j=0;j<4;j++) {
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
	for(t=0;t<10;t++) {
		for(j=0;j<2;j++) {
			System.out.print(sqrs[t][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("\n\tEND FUNCTION\n");
	//declarations int[] x= new x[]
	//alt int x[]= new x[]
	//link to array
	int[] nums2 = new int[10];
	int[] nums3 = new int[10];
	for (int i = 0; i < 10; i++){
		nums2[i] = i;
		nums3[i] = -i;
	}
	System.out.println("\n\tnumbers 2\n");
	for (int i = 0; i < 10; i++)
		System.out.print(nums2[i] + "\t");
	System.out.println();
	System.out.println("\n\tnumbers 3\n");
	for (int i = 0; i < 10; i++)
		System.out.print(nums3[i] + "\t");
	System.out.println();
	System.out.println("\n\tEND FUNCTION\n");
	System.out.println("\n\tEND\n");
	}
}
