import java.util.Scanner;

import Example.DoNotDivideZeroException;
import Example.Taschenrechner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car VW = new Car();
		
		VW.Preise = 6000.50;
		VW.Reifen = 4;
		
		
		Ipad ipad = new Ipad(500, "Ipad");
//		ipad.powerOn();
		
		Taschenrechner T_1 = new Taschenrechner();
		T_1.plus(1, 1);
		
		Taschenrechner.plus(1, 1);
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			int eingabe = scanner.nextInt();
			int eingabe2 = scanner.nextInt();
			
			
			Taschenrechner.dividieren(eingabe,eingabe2 );
		}
		catch (DoNotDivideZeroException e) {
			System.out.println("Nenner darf nicht 0 sein");
			System.out.println("Bitte neue Zahl eingeben");
			int new_input = scanner.nextInt();
			int new_input2 = scanner.nextInt();
			
			e.getMessage();
			
			try {
				Taschenrechner.dividieren(new_input, new_input2);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("Programm geht weiter");
		
		
	}

}
