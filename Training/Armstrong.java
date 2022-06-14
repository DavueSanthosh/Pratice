package Training;

public class Armstrong {

	 int num;
     int arm;
     int add;
     int sum;
     
     
     public Armstrong( int num, int arm,int add)
      {
    	 this.num=num;
    	 this.arm=arm;
    	 this.add=add;
    	 
	}
	
       public void checkTheNumber() {

      while (num>0) 
      {
		add=num%10;
		num=num/10;
		arm=arm+(num*num);
      }
      
	if (sum==arm) {
		System.out.println("the amstrong number");}
	
	else {
		System.out.println("the number is not armstrong");
	}
       }
       
   
	public static void main(String[] args) {
		Armstrong check= new Armstrong(27, 0, 0);
		check.checkTheNumber();
      }
	}


