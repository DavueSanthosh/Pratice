package Execrise;

import java.util.Scanner;

 public class NameOfLength
 {
	String name;
	int count = 0;
	
	public NameOfLength()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input");
		name = scan.next();
	}

	void countDigits()
	{
		
		for (int charIndex = 0; charIndex < name.length(); charIndex++) {
		    	count++;
		}
		System.out.println("The Word is:" +name );
		System.out.println("The lenght of the word:" +" "+ count);
	}
}

  