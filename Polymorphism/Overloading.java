package Polymorphism;

public class Overloading {

	String ResturantName, Location;
	long ResturantNumber;
	int ResturantBranches;

	public void name(String ResturantName) {

		System.out.println("Resturant Name:" + " " + ResturantName);

	}
    
	public void name(String Location, long ResturantNumber) {

		System.out.println("Resturant Location:" + "" + Location);
		System.out.println("Contact Number:" + " " + ResturantNumber);

	}

	public void name(int ResturantBranches) {

		System.out.println("Branches:" + " " + ResturantBranches);
	}

	public static void main(String[] args) {

		Overloading Food = new Overloading();
		Food.name("Grand inn");
		Food.name("Near Bus-Stand,Mayiladuthurai", 7373605854l);
		Food.name(5);

	}

}
