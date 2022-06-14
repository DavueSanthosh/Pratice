package String_Method;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {

		int num;
		int largestnum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size");
		num = scan.nextInt();

		int[] array = new int[num];
		System.out.println("Enter the number");

		for (int index = 0; index < num; index++) {
			array[index] = scan.nextInt();

		}
		for (int index = 0; index < num; index++) {
			System.out.println("Array is:" + " " + array[index]);
		}

		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			if (array[i] > largestnum) {
				largestnum = number;

			}
		}
		System.out.println("The largest number of the array:" + largestnum);
	}

}
//
//		// System.out.println(largestnum);
//		return largestnum;
//	}
