package Loop;

public class Break {

	public static void main(String[] args) {
		
		for (int index = 0; index <= 10; index++) {
			  if (index == 4) {
			    continue;
			  }
			  System.out.println(index);
			}
	}

}
