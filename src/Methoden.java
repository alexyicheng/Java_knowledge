

public class Methoden {

	public static void main(String[] args) {
		
		createenemy();
		// TODO Auto-generated method stub

		double erg =	calculator(3.547, 6.354, '*');
	System.out.println(erg);
//		erstellegegner("Peter", 100);
//		erstellegegner("Oliver", 100);

//		for (int i = 0; i < 10; i++) {
//			createenemy();
//		}
		// ausgabe();
		// summe();
	}

	public static void ausgabe() {
		System.out.println("Ich bin eine Methode!");
	}

	public static void summe() {
		int a, b, summe;

		a = 5;
		b = 3;
		summe = a + b;

		System.out.println(summe);
	}

	public static void createenemy() {
		String enemy = "Olaf";
		int Life = 100;
		System.out.println("Create Enemy!");

	}

	public static void erstellegegner(String name, int life) {
		String enemyString = name;
		int enemylife = life;
		System.out.println("Gengername: " + name);
		System.out.println("Lebenspunkten: " + life);
	}

	public static double calculator(double a, double b, char op) {

		double result = 0;

		switch (op) {

		case '+':
			result = a + b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			if (b != 0) {
				result = a % b;
				
			} else {
				System.out.println("Nenner darf nicht 0 sein");
			}
			;
			break;

		case '-':
			result = a - b;
			break;

		default: {
			System.out.println("Falsch Operator");
		}
		}
		
		return result;
	}

}
