package Polymorphism;

class Subjct3 
{
	
	public void maths() {
		System.out.println("the mark is 67");

	}

	
	public void science() {
		System.out.println("the mark 88");

	}
}

public class SubjctOverriding extends Subjct3
{
		@Override
		public void maths() {
			//super.maths();
			System.out.println("the mark is 77");
		}


	public static void main(String[] args) {
		SubjctOverriding student = new SubjctOverriding();
		student.maths();
		student.science();
	}
}

