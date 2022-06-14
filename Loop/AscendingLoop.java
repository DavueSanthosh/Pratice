package Loop;

public class AscendingLoop {

	public static void main(String[] args) {
		
	      int []number = {5, 2, 8, 7, 1};     
	       int temp = 0;    
		            
	     System.out.println("Original array: ");    
	       for (int index = 0; index < number.length; index++) {     
         System.out.print(number[index] + " ");    
		        
	       }    
		            
		    for (int index = 0; index < number.length; index++) { 
		    	
		    	
		    	for (int SecondIndex = index+1; SecondIndex < number.length; SecondIndex++) {     
	               if(number[index] > number[SecondIndex]) {    
	       
	            	   temp = number[index];    
	                   number[index] = number[SecondIndex];    
		                number[SecondIndex] = temp;    
		               }
		            }     
		        }    
		          
		        System.out.println();    
		            
		       System.out.println("Ascending order: ");    
		        for (int index = 0; index < number.length; index++) {     
		            System.out.print(number[index] + " ");    
		        }    
		    }    

}

