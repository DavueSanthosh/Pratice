package String_Method;

public class Return {

	Integer collectionAmount = 1000;
	Integer collection2 = 2000;

	public Integer collectionAmountgivetome() {
		System.out.println("san give money to arun" + collectionAmount + "sent to vidhya");
		return collection2;

	}

	public static void main(String[] args) {
		Return amt = new Return();
		Integer money = amt.collectionAmountgivetome();
		System.out.println("I got the money from arun" + money);
	}
}
