package Java_Program;

public class Food {
	
	String name;
	int quantity;
	String members;

	public Food(String name, int quantity, String members) {
		
		this.name = name;
		this.quantity = quantity;
		this.members = members;

		System.out.println("Food name:" + name);
		System.out.println("Food quantity:" + quantity);
		System.out.println("members:" + members);
	}

	public static void main(String[] args) {
		
		Food eat = new Food("Burger", 11, "six members");
	}

}
