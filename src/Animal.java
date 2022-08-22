
public abstract class Animal {

	// Eigenschaften/Attribute
	String nameString;
	int gewicht;
	int groeße;
	String artString;

	// Konstruktor
	public Animal(String name, int gew, int gro, String art) {
		this.nameString = name;
		this.gewicht = gew;
		this.groeße = gro;
		this.artString = art;
	}

	// Methode
	public void eat() {
		System.out.println("Jedes Tier muss essen.");
		System.out.println("jetzt isst " + this.nameString + " gerade.");
	}

	public abstract void atmen();
	
}
