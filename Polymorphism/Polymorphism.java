package Polymorphism;

public class Polymorphism {
        
	public void jump( String nam) {
        	System.out.println("Student:"+nam);

        }
	
        public void jump(String a,int b) {
              System.out.println("Student dept:"+a+"\n"+"Student ID:"+b);
		}
        
        public void jump(int c,float d,long e) {
        	System.out.println("Student:"+c+"\n"+d+"\n"+e);

		}
        
	public static void main(String[] args) {
		
		Polymorphism studentDetails=new Polymorphism();
		studentDetails.jump("Santhosh");
		studentDetails.jump("ICE",2013);
		studentDetails.jump(22, 0.5f,58709L );
	}

}
