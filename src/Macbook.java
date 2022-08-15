
public class Macbook extends Laptop {
	

	boolean touchBar;
	int cpu;
	
	public Macbook(String ram, double prise, String marke, int cpu, boolean touchBar) {
		super(ram, prise, "Macbook");
		this.touchBar = touchBar;
		this.cpu = cpu;
		// TODO Auto-generated constructor stub
	}
	
	public void Macbook() {
		super.starten();
		System.out.println(this.markeString + "ist bereit.");
	}
	
	

}
