//class = Object
//one Object could have more than 1 Value
public class Car {

	int Reifen;
	
	//staitc int Reifen = 4;
	double Preise;

	String marke;
	
	luntai Luntai;

	// konstruktor
	public Car() {

	}

	public Car(int Reifen, double Preise, String marke) {

		this.Reifen = Reifen;
		this.Preise = Preise;
		this.marke = marke;

	}
	
	public Car(int Reifen,double preis, String marke, String m, String typ ) {
		this.Reifen = Reifen;
		this.Preise = preis;
		this.marke = marke;
		this.Luntai = new luntai(m, typ);
	}

	public void drive() {

		System.out.println(this.marke + " fährt jetzt.");

	}

	public void bremsen() {
		System.out.println(this.marke + " bremst.");
	}

	public void compare(int preis) {
		
		if(this.Preise <= preis) {
			System.out.println( this.marke + " ist billiger.");
		}
		else {
			System.out.println(this.marke + " ist teuerer.");
		}
		
	}
	
	public static void ausgabe()
	{
		System.out.println("Ich bin eine Static Methode und benötige kein Objekt");
	}
	
	public void details () {
		System.out.println("Die Reifen sind von " + this.Luntai.markeString);
		System.out.println("Sie sind "+ this.Luntai.reifen);
	}
	
}

