package Training;

public class AscendingOrder {

	public static void main(String[] args) {
           int num[]= {2,3,4,7,9,3};
           int temp=0;
           
           System.out.println("The order is:");
           for (int Index = 0; Index < num.length; Index++) {
        	   System.out.print(num[Index]);
			
		}
           
           for (int Index = 0; Index < num.length; Index++) {
			for (int CharIndex = Index+1; CharIndex < num.length; CharIndex++) {
				if(num[Index]>num[CharIndex]) {
					temp=num[Index];
					num[Index]=num[CharIndex];
					num[CharIndex]=temp;
					
				}
				System.out.println("");
						
			}
		}
           System.out.println("The ascending order is");
           for (int Index = 0; Index < num.length; Index++) {
			System.out.println(num[Index]);
		}
	}
	
	

}
