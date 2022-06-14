package Execrise;


public class Arithmetic {
	
	int number1, number2, Total;
    String operation;
	public void mathematicalOperation() {

	
		String operation="add";
		System.out.println("the operator: "+ " "+operation );

		int number1, number2, Total;
		number1 = 10;
		number2 = 20;

		switch (operation) {

		case "add":
			Total = number1 + number2;
			System.out.println("Answer is" + " " + Total);

			break;

		case "sub":
			Total = number1 - number2;
			System.out.println("Answer is" + " " + Total);
			break;

		case "mul":
			Total = number1 * number2;
			System.out.println("Answer is" + " " + Total);
			break;

		case "div":
			Total = number1 / number2;
			System.out.println("Answer is" + " " + Total);
			break;

		case "mod":
			Total = number1 % number2;
			System.out.println("Answer is" + " " + Total);
			break;

		default:
			System.out.println("Enter the valid operator");
		}
	}
}
