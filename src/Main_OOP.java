
public class Main_OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car_1 = new Car();

		car_1.Preise = 12000;
		car_1.marke = "BMW";
		car_1.Reifen = 4;
		car_1.compare(10000);

		System.out.println("Preis: " + car_1.Preise);
		System.out.println("Reifen: " + car_1.Reifen);
		System.out.println("Marke: " + car_1.marke);

		Car car_2 = new Car();

		car_2.marke = "Audi";
		car_2.Preise = 6541;
		car_2.Reifen = 4;


		Car car_3 = new Car();

		car_3.marke = "VW";
		car_3.Preise = 3000;
		car_3.Reifen = 4;
		
		
		
		Car car_4 = new Car(4, 3000, "BYD");
		
		System.out.println("Preis: " + car_4.Preise);
		System.out.println("Reifen: " + car_4.Reifen);
		System.out.println("Marke: " + car_4.marke);

		car_4.drive();
		car_4.bremsen();
		
		car_4.compare(5000);
		
		Hund picoHund = new Hund("Picco", 5, "Chiwawa");
		
		picoHund.bellen();
		
		Laptop samsungLaptop = new Laptop("8GB", 600, "Samsung");
		samsungLaptop.getData();
		
		Laptop medionLaptop = new Laptop("4GB", 400, "Medion");
		medionLaptop.getData();

	}

	
}
