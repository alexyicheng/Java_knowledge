
public class Held {

	public String nameString;
	private int lebenspunkt;

	public Held(String name, int lebenspunkt) {
		this.nameString = name;
		if (lebenspunkt <= 100 && lebenspunkt > 0) {
			this.lebenspunkt = lebenspunkt;
		} else {
			this.lebenspunkt = 90;
		}
	}

	// getter
	public void getLebenspunkt() {

		System.out.println(this.lebenspunkt);
	}

	// setter
	public void setLebenspunkt(int schaden) {
		this.lebenspunkt -= schaden; // this.lebenspunkt = this.lebenspunkt - schaden
		System.out.println(this.lebenspunkt);

	}

}
