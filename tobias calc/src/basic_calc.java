import java.util.Scanner;
import java.io.IOException;

public class basic_calc {
	public static void main(String[] args){
	 
	
	
	 
	 Scanner noob = new Scanner(System.in);
	 Scanner test = new Scanner(System.in);
	 boolean KeepLooping = true;
	 boolean ExitLoop;
	 boolean N = KeepLooping;
		
	 
	 while (KeepLooping){
	 double ett, tv�;
	 String svar;
	 System.out.println("Enter first num: ");
	 ett = noob.nextDouble();
	 System.out.println("Enter second num: ");
	 tv� = noob.nextDouble();
	 System.out.println("Give me the operator");
	 svar = noob.next();
	 
	
	 
	 
	 switch (svar){
	 case "+":
		 System.out.println("Your result: "+(ett+tv�));
		 break;
	 case "-":
		 System.out.println("Your result: "+(ett-tv�));
		 break;
	 case "*":
		 System.out.println("Your result: "+(ett*tv�));
		 break;
	 case "/":
		 System.out.println("Your result: "+(ett/tv�));
		 if (tv� != 0){ System.out.println("Your result: "+(ett/tv�));
		 } else { System.out.println("ERROR!!! Division with null ist not possble");
		 }
		 break;
		
	 
	 }
	 
	 System.out.println("Is this your number? if Yes, please Press Y if Not please press N and try again");
	

	 String response = test.nextLine();
	 if(response.equalsIgnoreCase("Y")) {
		 KeepLooping = false;		 
	 } 
	
	 }
	 System.out.println("Program is terminated, BUT I'LL BE BACK!!");
	 System.exit(0);
	 }
}
