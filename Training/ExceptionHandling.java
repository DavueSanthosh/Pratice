package Training;

public class ExceptionHandling
{
   int number1,number2;
   int total;
   
   public void add(int number1,int number2) 
   {
	  
	   try {
		 
		   total=number1/number2;
		   System.out.println("Total is"+ " "+total);
	       
		
	} catch (Exception e) {
		System.out.println("Error");
 	}
	  
  }
     public static void main(String[] args) {
    	 ExceptionHandling maths=new ExceptionHandling();
    	 maths.add(20, 0);
	}
}


