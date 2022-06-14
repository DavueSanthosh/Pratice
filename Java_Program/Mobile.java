package Java_Program;

public class Mobile {
	String name = "oneplus";
	String model = "5t";
	int rate = 25000;

	public void phone() {
		
		System.out.println("name:" + name);
		System.out.println("model:" + model);
		System.out.println("rate:" + rate);
	}

	public static void main(String[] args) {
		Mobile mobilephones = new Mobile();
		mobilephones.phone();
	}

}
