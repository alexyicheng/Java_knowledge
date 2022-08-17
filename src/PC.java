
public class PC {

	String cpuString;
	Mainboard mainboard;
	int preis;

	public PC(String cpu, Mainboard M,int preis) {
		this.mainboard = M;
		this.cpuString = cpu;
		this.preis = preis;
	}

	public PC(int ramSolts, int kartenSlots, int usbPorts, String cpu) {
		mainboard = new Mainboard(ramSolts, kartenSlots, usbPorts);
		this.cpuString = cpu;
	}

}
