
public class Main_OOP_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inherit Object inherit from Super() Mother class
		Katze mumiKatze = new Katze("Mumi", 10, 5, 3);
		mumiKatze.miao();
		mumiKatze.eat();

		Kuh olKuh = new Kuh("Ol", 50, 10, "Kuh");
		olKuh.eat();

		Bird danielaBird = new Bird("Daniela", 3, 5, true);
		danielaBird.fly();

		Macbook macbook = new Macbook("8GB", 8000, null, 2, true);
		macbook.Macbook();

		// Association a Object include one other object
		Mainboard M1 = new Mainboard(4, 2, 4);
		PC pc = new PC("Intel", M1, 500);
		System.out.println(pc.mainboard.ramSlots);

		PC pc_2 = new PC(10, 1, 2, "AMD");
		System.out.println(pc_2.mainboard.ramSlots);
		
		Car bMWCar = new Car(4, 1500, "BMW", "Continental", "Winterreifen");
		bMWCar.details();
		
		Held player = new Held("Joe", -50);
		player.getLebenspunkt();
		
		int schaden = 10;
		
		player.setLebenspunkt(schaden);
		
		
		
		Account jBAccount  = new Account("Justin Biber", "0210521452");
		jBAccount.setPasswordString("0210521452");
			
		
		
		
	
		
	}

}
