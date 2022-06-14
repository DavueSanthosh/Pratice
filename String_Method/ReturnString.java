package String_Method;

public class ReturnString {

	String name = "San";
	String name2 = "Vidhya";

	public String method() {
		System.out.println("the name" + " " + name);
		System.out.println("Sis name" + " " + name2);
		return name2;
	}

	public static void main(String[] args) {
		ReturnString nas = new ReturnString();
		String sis = nas.method();
		System.out.println("Sis name" + " " + sis);

	}
}
