class automobile {
	int passagers;
	int fuelTank;
	double fuelConsuption;
}
class pr004 {
	public static void main(String[] args) {
		automobile car = new automobile();
		car.passagers = 4;
		car.fuelTank = 65536;
		car.fuelConsuption = 128.0;
		automobile carPrototype = new automobile();
		carPrototype.passagers = 8;
		carPrototype.fuelTank = 32768;
		carPrototype.fuelConsuption = 1024.0;
		System.out.println("\tparameters car:\t" + car);
		System.out.println("\t\tpassagers:\t" + car.passagers);
		System.out.println("\t\tfuelTank:\t" + car.fuelTank);
		System.out.println("\t\tfuelConsuption:\t" + car.fuelConsuption);
		System.out.println("\t\tfuelEconomy:\t" + car.fuelTank/car.fuelConsuption);
		System.out.println("\tparameters carPrototype:\t" + carPrototype);
		System.out.println("\t\tpassagers:\t" + carPrototype.passagers);
		System.out.println("\t\tfuelTank:\t" + carPrototype.fuelTank);
		System.out.println("\t\tfuelConsuption:\t" + carPrototype.fuelConsuption);
		System.out.println("\t\tfuelEconomy:\t" + carPrototype.fuelTank/carPrototype.fuelConsuption);
	}
}
