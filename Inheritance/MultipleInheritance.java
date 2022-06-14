package Inheritance;

   interface DogDhoni {

	   void bark();
	   void eat();

 }

   interface CatTom {

	   void meow();
	   void eat();
 }

 public class MultipleInheritance implements DogDhoni, CatTom {

	@Override
	public void meow() {

		System.out.println("The cat name is Tom");

	}

	@Override
	public void bark() {

		System.out.println("the dog name is Dhoni");
	}

	@Override
	public void eat() {

		System.out.println("Both pet are drinks milk");
	}

	public static void main(String[] args) {

		MultipleInheritance pet = new MultipleInheritance();
		pet.bark();
		pet.meow();
		pet.eat();
	}

}
