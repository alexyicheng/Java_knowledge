import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 4000;
		
		if(score == 5000) {
			System.out.println("Herzlich Glückwünsch neuer Rekord!");
		}
		else {
			System.out.println("schade dein Score reicht leider nicht!");
		}
		
		int lebenPlayer = 3;
		
		if (lebenPlayer == 0)
		{
			System.out.println("Spiel verloren.");
		}
		
		boolean gegnerHit = true; //switch with true/false
		int highscore = 0;
		
		if(gegnerHit == true) {
			System.out.println("Gegner getroffen.");
			highscore += 20;
			System.out.println("Highscore: "+highscore);
		}
		else {
			System.out.println("Daneben");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben sie ein Wert ein: ");
		
		int eingabe = input.nextInt();
		
		if(eingabe == 50) {
			System.out.println("Deine Eingabe ist genau " + eingabe);
		}
		else if (eingabe > 50)
		{
			System.out.println("Deine Eingabe ist größer als 50.");
		}
		else 
		{
			System.out.println("Deine Eingabe ist kleiner als 50.");
		}
		
	}

}
