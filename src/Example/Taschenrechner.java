package Example;

public class Taschenrechner {

	// static method means, that is not necessary to create a object at first
	// you are able to use the methode over the name of class (Taschenrechner)
	public static void plus(int eingabe1, int eingabe2) {
		System.err.println("Ergebnis: " + (eingabe1 + eingabe2));
	}

	public static void minus(int eingabe1, int eingabe2) {
		System.err.println("Ergebnis: " + (eingabe1 - eingabe2));
	}

	public static void dividieren(int eingabe1, int eingabe2)  throws DoNotDivideZeroException{
		
		if(eingabe2 == 0) {
			throw new DoNotDivideZeroException("0 kann nicht geteilt werden.");
		}
		else {
			System.out.println("Ergebnis: " + (eingabe1 / eingabe2));
		}

		

	}

}
