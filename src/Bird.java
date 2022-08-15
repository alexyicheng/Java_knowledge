
public class Bird extends Animal {
	
	//Eigenschaft/Attributte
	boolean fly;

	//Konstruktor
	public Bird(String name, int gew, int gro, boolean fly) {
		super(name, gew, gro, "Vogel");
		this.fly = fly;
		// TODO Auto-generated constructor stub
	}

	//Methoden
	public void fly() {
		System.out.println(this.nameString + " kann fliegen.");
	}

}
