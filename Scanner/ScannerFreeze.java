package Scanner;

import java.util.Scanner;

public class ScannerFreeze {

	public static void main(String[] args) {
         Scanner IdCard =new Scanner(System.in);
         System.out.println("All details");
         
         String name = IdCard.next();
         System.out.println("Real name:");
         
         int phoneNumber = IdCard.nextInt();
         System.out.println("numbers");
	}

}
