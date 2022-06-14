package Java_Program;


	class Thor{
		protected void loki() {
			
      System.out.println("bring me thanos");
		}
		
	}
	
	public class AvengersPublic {
			public void cap() {
				
				System.out.println("i can do this all day");
			}
			

	public static void main(String[] args) {
		
		AvengersPublic marvel = new AvengersPublic();
		Thor hammer=new Thor();
		marvel.cap();
		hammer.loki();
	}
		}

		