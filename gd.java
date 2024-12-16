class Gen <T> {

	T ob;


	Gen(T o){
		ob = o;
	}

	T getOb(){
		return ob;
	}

	void showType(){
		System.out.println("тип Т: " + ob.getClass().getName());
	}
}
class GenDemo{
	public static void main(String[] args){

		Gen <Integer> iOb;

		iOb = new Gen <Integer> (100);


		iOb.showType();
		int v = iOb.getOb();
		System.out.println("значение v: " + v);
		System.out.println();


		Gen <Double> dOb;

		dOb = new Gen <Double> (100.1);


		dOb.showType();
		double x = dOb.getOb();
		System.out.println("значение x: " + x);
		System.out.println();



		Gen <String> sOb;

		sOb = new Gen <String> ("строка");

		sOb.showType();
		String s = sOb.getOb();
		System.out.println("значение s: " + s);
		System.out.println();




	}

}
