package javazoom.io;

import java.util.Scanner;

public class Name {

	
	String f�rnamn ="";
	String efternamn = "";
	String spelarnamn = "";
	String forts�tt = "";
	String pAge = "";
	
    //F�rnamn & efternamn
	//samt spelarnamn

// constructor, public Name (){}
public Name()
{
	System.out.print("Fyll i ditt f�rnamn, efternamn, �lder och spelarnamn. Tryck Enter f�r att b�rja!");
	
	
	Scanner in = new Scanner(System.in);
	String Name= in.nextLine();
	
	
	System.out.println("F�rnamn:");
	String f�rnamn = in.nextLine();
	
	
	System.out.println("Efternamn:");
	String efternamn = in.nextLine();
	
	
	System.out.println("spelarnamn:");
	String spelarnamn= in.nextLine();
	
	System.out.println("Skriv in din �lder");
    String pAge = in.nextLine();

    
	System.out.println("Skriv:Play");
	System.out.print("f�r att forts�tta");
	String forts�tt = in.nextLine();
	
	
	while (!(forts�tt.equals("Play")  )  )
	{
		//h�r hanteras sakern som skall g�ras och h�nda?
		System.out.println("Tryck n�sta eller skriv:Play");
		System.out.print("f�r att forts�tta");
		forts�tt = in.nextLine();
	
	}

}
}