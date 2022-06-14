package ExceptionHandling;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;

		try {
			int d = a + b / c;
			System.out.println(d);

		} catch (ArithmeticException e) {

			System.out.println("Enter the correct number");
		}

		String s = null;

		try {

			int x = s.length();
			System.out.println(x);

		} catch (NullPointerException e1) {

			System.out.println("Null pointer");

		}

		String s1 = "Food";
		try {
			char d = s1.charAt(9);
			System.out.println(d);

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("StringIndexOutOfBoundsException");
		}

	}

}
