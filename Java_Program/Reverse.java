package Java_Program;

public class Reverse {

	public static void main(String[] args) {

		String Statement = "Be happy";
		String reverse = "";

		{

			for (int Index = Statement.length() - 1; Index >= 0; Index--) {
				reverse = reverse + Statement.charAt(Index);
			}
			System.out.println("Normal :"+" " +Statement);
			System.out.println("Reverse:"+" "+ reverse);
		}
	}
}