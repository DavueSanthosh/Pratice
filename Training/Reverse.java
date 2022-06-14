package Training;

public class Reverse {

	public static void main(String[] args) {
		
        String name="John Cena";
        String rev="";
        
        for (int  Index=name.length()-1;Index>=0; Index--) {
        	char SplitChar=name.charAt(Index);
        	rev=rev+name.charAt(Index);
			
		}
        System.out.println("The Reverse name is"+rev);
	}

}
