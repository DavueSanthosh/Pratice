package Polymorphism;

public class TravelPoly {
	
	public void bus() {
		String name = "Bus travel";
		System.out.println("Chennai to Bangolre:" + name);
	
	}

	public void bike() {
		
		String name1 = "Train travel";
		System.out.println("Chennai to Bangolre:" + name1);
	}

	public void aero() {
		
		String name2 = "airways travel";
		System.out.println("Chennai to Bangolre:" + name2);
	}

	public static void main(String[] args) {
		
		TravelPoly tarvel = new TravelPoly();
		tarvel.bus();
		tarvel.bike();
		tarvel.aero();
	}

}
