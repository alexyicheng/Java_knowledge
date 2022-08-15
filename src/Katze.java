
public class Katze extends Animal {
	
	//Konstruktor
	int zaehne;

	public Katze(String nameString, int gewicht, int groeße, int zaehne) {
		super(nameString, gewicht, groeße, "Katze");
		this.zaehne = zaehne;
	}

	//Methoden
	public void miao() {
		System.out.println(this.nameString + " miaot gerade.");
	}

	public void eat() {

		System.out.println(this.nameString + "muss noch kauen.");
		super.eat();
	}

}
