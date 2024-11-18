import java.util.Random;
class bit {
	public static void main(String[] args) {
		System.out.println("\n\tSTART\n");
		Random rand = new Random();
		// change 6 bit
		char c;
		System.out.println("\n\tchange regist character:\n");
		for(int i=0;i<26;i++) {
			c = (char)('a'+i);
			System.out.print(c);
			c = (char)((int)c&65503);
			System.out.print(c+" ");
		}
		System.out.println("\n\tFunction stopped\n");
		// nuber to 2
		int t;
		byte val;
		val = 1;
		System.out.println("\n\tbits\t");
		for(t=128;t>0;t=t/2) {
			if((val&t) !=0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println("\n\tFunction stopped\n");
		//big to small
		for(int i=0;i<26;i++) {
			c = (char)('A'+i);
			System.out.print(c);
			c = (char)((int)c|32);
			System.out.print(c+" ");
		}
		System.out.println("\n\tFunction stopped\n");
		//cipher
		String msg = "minecraft";
		String coded ="";
		String decoded ="";
		String decoded2 ="";
		int key = rand.nextInt(64);
		System.out.println("\n\tKEY:\t" + key);
		System.out.println("\n\tmsg:\t" + msg);
		for(int i=0;i<msg.length();i++)
			coded = coded + (char) (msg.charAt(i)^key);
		for(int i=0;i<msg.length();i++)
			decoded = decoded + (char) (coded.charAt(i)^key);
		for(int j=0;j<64;j++) {
		for(int i=0;i<msg.length();i++)
			decoded2 = decoded2 + (char) (coded.charAt(i)^j);
		System.out.println("\tdecoded2:\t" + decoded2);
		decoded2 ="";
		//System.out.println();
		}
		System.out.println("\n\tcoded:\t" + coded);
		System.out.println("\n\tdecoded:\t" + decoded);
		System.out.println("\n\tdecoded:\t" + decoded2);
		System.out.println("\n\tFunction stopped\n");
		//bits no
		byte b = 1;
		System.out.println("\n\tbits\t");
		for(int t2=128;t2>0;t2=t2/2) {
			if((b&t2) !=0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println("\n\tFunction stopped\n");
		b = (byte) ~b;
		System.out.println("\n\tbits\t");
		for(int t2=128;t2>0;t2=t2/2) {
			if((b&t2) !=0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println("\n\tFunction stopped\n");
		int val2 =1;
		for (int i=0;i<7;i++) {
			for(int t2=128;t2>0;t2=t2/2) {
				if((val2&t2) !=0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println("\t");
			val2 = val2 << 1;
		}
		for (int i=0;i<8;i++) {
			for(int t2=128;t2>0;t2=t2/2) {
				if((val2&t2) !=0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
			val2 = val2 >> 1;
		}
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tEND\n");
	}
}
