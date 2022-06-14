package Loop;

public class PraticeCounting {

	public static void main(String[] args) {
      int num=5647;
      
      int total = 0,sum=0;
      
      while(num>0) {
    	  
    	  sum=num%10;
    	  total=total+sum;
    	  num=num/10;
    	 
	}
      System.out.println("Sum of the all digits:"+total);
    }
}
