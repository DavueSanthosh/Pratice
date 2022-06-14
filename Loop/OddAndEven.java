package Loop;

public class OddAndEven {

	public static void main(String[] args) {
     int  count=0;
     
      for (int index = 1; index <=100; index++) {
    	  
    	  if (index%2==0) {
    		  
          System.out.println("the num is even");
          count++;
		}
    	  else {
    		  
    		  System.out.println("the num is odd");
    		  count++;
    	  }
    		  
		System.out.println(index);
	}
	}

}
