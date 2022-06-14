package Loop;

public class Switch
{

	public static void main(String[] args)
	{
          int number=60; 
          
          switch(number/10) {
          
          case 10:
           System.out.println("Grade F");
           break;
           
          case 9:
        	  System.out.println("Grade A");
        	 break;
        	 
          case 8:
        	  System.out.println("Grade B");
        	  break;
        	  
          case 7:
        	  System.out.println("Grade C");
        	  break;
        	  
          case 6:
        	  System.out.println("Grade D");
        	  break;
        	  
          case 5:
        	  System.out.println("Grade E");
        	  break;
        	  
        	  default:
        		  System.out.println("Fail");
        		  break;
          }
	}

}
