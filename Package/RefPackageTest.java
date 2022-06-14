package Package;

public class RefPackageTest {
	
     public void pack() {
       String avengers="wanda";
       System.out.println("the queeen"+avengers);
      
		}
	public static void main(String[] args) {
		
		RefPackageTest marvel=new RefPackageTest();
		   marvel.pack();
		
		Animal pet2=new Animal();
	       pet2.pet();	
	}

}
