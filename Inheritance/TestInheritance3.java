package Inheritance;

class Wild {
	void eat() {

		System.out.println("eating...");
	}
}

class Dog extends Wild {

	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Wild {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestInheritance3 {
	public static void main(String args[]) {
		Cat sound = new Cat();
		Dog pet = new Dog();
		pet.bark();
		sound.meow();
		sound.eat();
	}
}