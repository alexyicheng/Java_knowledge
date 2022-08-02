import java.util.Scanner;


public class ReadII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Person P_1 = new Person();
		
		Scanner scan = new Scanner(System.in);
		
		//first nextLine() Than nextInt() Otherwise the nextLine() doesnot wait the user input
		
		System.out.println("Bitte geben Sie Ihren Name an: ");
		
		P_1.Name = scan.nextLine();
		
		System.out.println("Bitte geben Sie Ihrer Alter an: ");
		
		P_1.Age = scan.nextInt();
		
		System.out.println("Bitte geben Sie Ihre Geschlecht(w/m) an: ");
		
		P_1.gender = scan.next().charAt(0);
		
		
		//twice nextLine() doesnot work 
		System.out.println("Bitte geben Sie ihrer Telefonnummer an: ");
		
		P_1.phone = scan.next();
		
		
		
		
		
		System.out.println("Name: "+P_1.Name);
		System.out.println("Geschlecht: "+ P_1.gender);
		System.out.println("Alter: "+P_1.Age);
		System.out.println("Telefonnummer: "+P_1.phone);
		
		
		
		scan.close();
		
	}

}
