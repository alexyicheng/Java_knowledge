
public class Kuh extends Animal {

	//konstruktor
	public Kuh(String name, int gewicht, int groeße, String art) {
		super(name, gewicht, groeße, art);
	}

	//Methode
	public void eat() {
		super.eat();
		System.out.println("Jetzt isst die Kuh.");
	}

}
