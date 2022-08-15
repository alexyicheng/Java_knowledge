
public class Main_OOP_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Katze mumiKatze = new Katze("Mumi", 10, 5, 3);
		mumiKatze.miao();
		mumiKatze.eat();

		Kuh olKuh = new Kuh("Ol", 50, 10, "Kuh");
		olKuh.eat();

		Bird danielaBird = new Bird("Daniela", 3, 5, true);
		danielaBird.fly();
		
		Macbook macbook = new Macbook("8GB", 8000, null, 2, true);
		macbook.Macbook();
	}

}
