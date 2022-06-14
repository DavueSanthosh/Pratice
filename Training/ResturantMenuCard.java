package Training;

import java.util.Scanner;

public class ResturantMenuCard {

	public static void main(String[] args) {
		Scanner food = new Scanner(System.in);

		System.out.println("Welcome to the food court");
		System.out.println("Breakfast press 1");
		System.out.println("Lunch press 2");
		System.out.println("Dinner press 3");
		System.out.println("Press the number what you want");

		int eat = food.nextInt();

		switch (eat) {

		case 1:
			System.out.println("All Veg and Non-veg food avaiable ");
			System.out.println("Veg or Non-Veg");

			String lunch1 = food.next();
			String ChooseTheFood = "Veg";

			if ("Veg" == ChooseTheFood) {
				System.out.println("Dosa,Idly,Pongal,Chapathi etc");
			} else {
				System.out.println("Chapathi/Poori/Dosa with Chicken");
			}

			break;
		case 2:

			System.out.println("All Veg and Non-Veg food avaiable");
			System.out.println("Veg or Non-Veg");

			String lunch2 = food.next();

			String Choose = "Non-Veg";

			if (Choose == "Non-Veg") {
				System.out.println("Briyani or Non veg rice");
			} else {
				System.out.println("chapathi or parato");
			}
			break;

		case 3:

			System.out.println("All Veg and Non-Veg food avaiable");
			String drink = food.next();
			String ChooseFood = "Non-Veg";
			if ("Non-Veg" == ChooseFood) {
				System.out.println("Chapathi/Poori/Dosa with Chicken");
			} else {

				System.out.println("Dosa,Idly,Pongal,Chapathi etc");
			}
		}

	}

}
