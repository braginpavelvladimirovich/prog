class TwoGen <T, V> {

	T ob1;
	V ob2;

	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;

	}
	T getOb1(){
		return ob1;
	}

	V getOb2(){
		return ob2;
	}

	void showType(){
		System.out.println("тип Т: " + ob1.getClass().getName());
		System.out.println("тип V: " + ob2.getClass().getName());
	}
}
class TwoGenDemo{
	public static void main(String[] args){
		TwoGen <Integer, Double> tgOb;


		tgOb = new TwoGen<Integer, Double> (100, 109.1);


		tgOb.showType();
		int v1 = tgOb.getOb1();
		double v2 = tgOb.getOb2();
		System.out.println("значение v1: " + v1);
		System.out.println("значение v2: " + v2);
		System.out.println();

		TwoGen <Integer, String> tgOb2;

		tgOb2 = new TwoGen<Integer, String> (100, "da");


		tgOb2.showType();
		int s1 = tgOb2.getOb1();
		String s2 = tgOb2.getOb2();
		System.out.println("значение s1: " + s1);
		System.out.println("значение s2: " + s2);
		System.out.println();



	}

}
