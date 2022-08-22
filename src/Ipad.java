
public class Ipad extends Apple implements ITelefon {
	
	public Ipad(double price, String producttyp) {
		super(price,producttyp);		
	}

	@Override
	public void powerOn() {
		System.out.println("Ipad ist aktiviert");
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean Ringering() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean call() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
