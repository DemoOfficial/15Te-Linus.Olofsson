import java.util.Scanner;

public class Palindrom {

	public static void main(String[]args){
	
		String mening = new String ();
		int antaltecken;
		
		System.out.print("skriv in en mening: " );
		Scanner tangentbord = new Scanner(System.in);
		
		mening = tangentbord.nextLine();
		
		antaltecken = mening.length();
	    System.out.println("meningar är "+antaltecken+"tecken lång" );
	    tangentbord.close();
	    
	    // vi vänder på meningen och skriver ut den.
	    for(int plats = antaltecken-1; plats >= 0; plats --){
	    	System.out.print(mening.charAt(plats));
	    }
	String reversed = new StringBuilder(mening).reverse().toString();
	    
	    if(mening.replaceAll(" ", "").equalsIgnoreCase(reversed.replaceAll(" ", ""))){
	    	System.out.println("Ett palindrom!");
	    }
}}
