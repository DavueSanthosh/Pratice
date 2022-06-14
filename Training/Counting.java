package Training;

public class Counting {

	public static void main(String[] args) {
          int num=12987;
          int sum=0;
          int add=0;
          
          while (num>0) 
          {
			sum=num%10;
			num=num/10;
			add=add+sum;
		}
          System.out.println("Sum of the digit:"+add);
	}

}
