import java.util.Random;
class ShowBits {
	int numbits;
	ShowBits(int n) {
		numbits = n;
	}
	void show(long val) {
		long mask = 1;
		//mov left 1
		mask <<= numbits-1;
		int spacer = 0;
		for(;mask !=0; mask >>>= 1) {
			if((val & mask) !=0) 
				System.out.print("1");
			else
				System.out.print("0");
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer =0;
			}
		}
		System.out.println();
	}
}
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
		//System.out.println("\n\tShowBits\n" + ShowBits(val2));
		ShowBits b3 = new ShowBits(8);
		ShowBits i3 = new ShowBits(32);
		ShowBits l3 = new ShowBits(64);
		System.out.println("\n\tbyte:\t");
		b3.show(255);
		System.out.println("\n\tint:\t");
		i3.show(4294967295l);
		System.out.println("\n\tlong:\t");
		l3.show(9223372036854775807l);
		l3.show(-1);
		System.out.println("\n\tFunction stopped\n");
		int absval;
		val = -64;
		absval = val < 0 ? -val : val;
		System.out.println("\n\tval:\t" + val + " " + absval);
		System.out.println("\n\tFunction stopped\n");
		int res;
		for(int i=-5;i<6;i++) {
			res = i !=0 ? 100 / i : 0;
			if(i !=0)
				System.out.println("\n\t100 /" + i + " = " + res);
		}
		System.out.println("\n\tFunction stopped\n");
		System.out.println("\n\tEND\n");
	}
}
