import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {
		boolean Play=true;
		boolean Exit;
		boolean N = Play;
		Scanner test = new Scanner(System.in);
		int dator;
		int spelare;
		String choice [] = {"sten", "sax", "p�se"};
		dator = (int) Math.random() *3;


		System.out.println("sten sax p�se!");
		for(dator,spelare);{
			System.out.println("Skriv in 0 f�r sten, 1 f�r sax, 2 f�r p�se");

			Scanner spelarval = new Scanner(System.in);
			Scanner in = new Scanner(System.in);
			spelare = spelarval.nextInt();
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
			
			System.out.println("to play again press Y if you wish to give up press N");

			String response = spelarval.nextLine();
			if(response.equalsIgnoreCase("Y")) {
				Play = false;		 
			}
		} while (Play);
	}
}

//do{
//spelare = spelarval.nextInt();

//}while(!((spelare <3))) && (( dator >3))

// for(int spelarval=0; spelarval<2; spelarval=++);




