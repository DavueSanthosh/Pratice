package Inheritance;

class ChennaiSuperKings 
{
	//String bat = "MSD";

	public void capatin() {
		System.out.println("bat");

	}
}

class Ipl extends ChennaiSuperKings 
{
	//int game = 10;

	public void DLF() {
		System.out.println("game");

	}
}

class Rcb extends Ipl {
	//String player = "VK";

	public void King() {
		System.out.println("player");

	}
}

public class GameInheritance {

	public static void main(String[] args) {
		Rcb Cricket = new Rcb();
		Cricket.King();
		Cricket.capatin();
		Cricket.DLF();

	}

}
