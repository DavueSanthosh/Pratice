package Scanner;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class EmployeeScanner {

	public static void main(String[] args) {

		Scanner student = new Scanner(System.in);
		System.out.println("Employee Deatil");

		int ID = student.nextInt();
		System.out.println("Employee Id");

		String name = student.next();
		System.out.println("Employee name");
	}

}
