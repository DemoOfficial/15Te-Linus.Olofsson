import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {
		
		int dator,spelare;
		String choice [] = {"sten", "sax", "p�se"};
		dator = (int) Math.random() *3;
		
		
		System.out.println("sten sax p�se!");
		System.out.println("Skriv in 0 f�r sten, 1 f�r sax, 2 f�r p�se");
		
		Scanner spelarval = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(spelare=0; spelare<3; spelare++);{
		//do{
			//spelare = spelarval.nextInt();
		
		//}while ((spelare == 0) && (dator == 1));
		System.out.println();
		System.out.println("Du valde: "+choice[spelare]);
		System.out.println("Datorn valde: "+choice[dator]);
		in.close();
		if ((spelare == 0) && (dator == 1) ||
				(spelare ==1 && dator == 2) ||
				(spelare == 2 && dator == 0))
			System.out.println("Du vann!");
		else if (dator == spelare)
			System.out.println("Oavgjort!");
		else
			System.out.println("RIP!");
	}



		//do{
			//spelare = spelarval.nextInt();
		
		//}while(!((spelare <3))) && (( dator >3))
	
	// for(int spelarval=0; spelarval<2; spelarval=++);
	}
}

