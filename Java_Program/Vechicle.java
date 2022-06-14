package Java_Program;

public class Vechicle {

	String a="Contential GT";
	int b=650;
	String c="sliver";
	
	public void Bike() {
		
     System.out.println("Bike name:"+a);
     System.out.println("Bike cc:"+b);
     System.out.println("Bike color:"+c);
     
	}
	
	public static void main(String[] args) {
        Vechicle twowheelers=new Vechicle();
        twowheelers.Bike();
	}

}