package Training;

import java.util.Scanner;

class Drinks {
	String name;

	public Drinks() {
		Scanner scan = new Scanner(System.in);
		System.out.println("The name is san");
		name = scan.next();
	}

	public void eat() {
		int count = 0;
		for (int Index = 0; Index < name.length(); Index++) {
			count++;
		}
		System.out.println(count);
	}

}

public class Drink {
	public static void main(String[] args) {
		Drinks lemon = new Drinks();
		lemon.eat();
	}

}
