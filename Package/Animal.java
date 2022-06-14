package Package;

import Java_Program.Dog;

public class Animal {
	String name = "Dhoni";
	String Color = "white";
	int Height = 2;

	public void pet() {
		System.out.println("Name:" + name);
		System.out.println("Color:" + Color);
		System.out.println("Height:" + Height);
	}

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.pet();
	}
}
