package Static;

public class Food {
	int number = 10;
	static String name = "Burger";
	String eat = "Pizza";

	static void meatandeat() {
		String name = "Cheese";
		System.out.println(name);
	}

	static void kfc() {
		System.out.println("Drinbk");

	}
	public static void main(String[] args) {
		meatandeat();
		kfc();
	}

}
