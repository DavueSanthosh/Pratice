package Polymorphism;

class Overriding2 
{
	
	public void maths() {
		System.out.println("maths mark is 99");
	}

	public void social() {
		System.out.println("social mark is 33");
	}

}

class Overriding extends Overriding2 {
	
	@Override
	public void maths() {
		super.maths();
	
		System.out.println("maths mark is 98");
	}

	public static void main(String[] args) {
		
		Overriding subject = new Overriding();
		subject.maths();
		subject.social();
	}
}