import java.io.ObjectInputStream.GetField;

import javax.sound.sampled.TargetDataLine;

public class Laptop {
	String ramString;
	double prise;
	String markeString;
	
	public Laptop(String ram, double prise, String marke )	{
		
		this.ramString = ram;
		this.prise = prise;
		this.markeString = marke;
	}
	
	public void getData() {
		
		System.out.println("Ram: " + this.ramString);
		System.out.println("Preise: "+ this.prise);
		System.out.println("Marke: "+ this.markeString);
		
	}
	
	
}
