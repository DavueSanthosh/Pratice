package Constructor;

public class Laptop {
	
	public Laptop(float Model) {
		System.out.println("screen size:" + Model);
	}

	public Laptop(String name) {
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		Laptop weight = new Laptop(500.67f);
		Laptop company = new Laptop("Dell");
		Laptop service = new Laptop("Lenovo");
	}

}
