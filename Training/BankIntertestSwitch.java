package Training;

public class BankIntertestSwitch {
	
	String BankInterest;
	
	public BankIntertestSwitch(String BankInterest) {
		
		this.BankInterest=BankInterest;
	}
	   
	   public void interest() {

		switch (BankInterest) {
		
		
		case "5% Interest":
			System.out.println("Axis bank has 5% Interest");
			break;
		
			
		case "7% Interest":
			System.out.println("HDFC bank has 7% Interest");
			break;
			
			
		case "10% Interest":
			System.out.println("ICIC bank has 10% Interest");
			break;
			
			
		default:
			
			System.out.println("No Loan for user");
           break;
		}
	  }
		public static void main(String[] args) {
			
	BankIntertestSwitch interestPercentage=new BankIntertestSwitch("10% Interest");
			interestPercentage.interest();
	}

}
