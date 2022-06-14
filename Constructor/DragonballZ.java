package Constructor;

public class DragonballZ {
	
   String Gohan,Bulma,Krillin;
   int power;
   
   public DragonballZ(String Gohan,String Bulma,String Krillin,int power) {
	   
	   this.Gohan=Gohan;
	   this.Bulma=Bulma;
	   this.Krillin=Krillin;
	   this.power=power;
 }
   
   public void beerus() {
	   
     System.out.println("the god of saiyan"+Gohan);
     System.out.println("the prince of saiyan"+Bulma);
     System.out.println("the child of saiyan"+Krillin);
     System.out.println("power"+power);
 }
	public static void main(String[] args) {
		
		DragonballZ fav=new DragonballZ("Goku", "Vegata","Trunks",3000);
		fav.beerus();
	}

 }
