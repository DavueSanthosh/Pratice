package Training;

import java.util.Scanner;

class TotalLetters 
{
	String LengthOfChar;

	public TotalLetters()
	{

		Scanner name = new Scanner(System.in);
		System.out.println("Check the length of the input");
		LengthOfChar = name.next();

	}

	public void checkTheLenght() 
	{
		int count = 0;
		for (int Index = 0; Index < LengthOfChar.length(); Index++) {
			count++;

		}
		System.out.println(count);
	}
}

public class LenConstructor 
{
	public static void main(String[] args) {
		TotalLetters obj = new TotalLetters();
		obj.checkTheLenght();

	}

}
