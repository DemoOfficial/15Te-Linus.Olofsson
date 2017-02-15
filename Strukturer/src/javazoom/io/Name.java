package javazoom.io;

import java.util.Scanner;

public class Name {

	
	String förnamn ="";
	String efternamn = "";
	String spelarnamn = "";
	String fortsätt = "";
	String pAge = "";
	
    //Förnamn & efternamn
	//samt spelarnamn

// constructor, public Name (){}
public Name()
{
	System.out.print("Fyll i ditt förnamn, efternamn, ålder och spelarnamn. Tryck Enter för att börja!");
	
	
	Scanner in = new Scanner(System.in);
	String Name= in.nextLine();
	
	
	System.out.println("Förnamn:");
	String förnamn = in.nextLine();
	
	
	System.out.println("Efternamn:");
	String efternamn = in.nextLine();
	
	
	System.out.println("spelarnamn:");
	String spelarnamn= in.nextLine();
	
	System.out.println("Skriv in din Ålder");
    String pAge = in.nextLine();

    
	System.out.println("Skriv:Play");
	System.out.print("för att fortsätta");
	String fortsätt = in.nextLine();
	
	
	while (!(fortsätt.equals("Play")  )  )
	{
		//här hanteras sakern som skall göras och hända?
		System.out.println("Tryck nästa eller skriv:Play");
		System.out.print("för att fortsätta");
		fortsätt = in.nextLine();
	
	}

}
}