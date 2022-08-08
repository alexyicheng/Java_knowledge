import java.util.Scanner;

public class SwitchCaseBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*switch(5) {
		
		case 0:
			System.out.println("Die Zahl ist eine 0.");
			break;
			
		case 3: 
			System.out.println("Die Zahl ist eine 3.");
			break;
			
		case 5:
			System.out.println("Die Zahl ist eine 5.");
			break;     
		
		}*/
		
		System.out.println("Wie viele Bündeslände gibt es in Deutschland ?");
		System.out.println("16,3,15 oder 30 ");
		
		Scanner input = new Scanner(System.in);
		
		int eingabe = input.nextInt();
		
		switch(eingabe) {
		
			case 16: 
				System.out.println("Korrekt");
				break;
				
			case 0:
				System.out.println("Falsch");
				break;
				
			case 15:
				System.out.println("Falsch");
				break;
				
			case 30:
				System.out.println("Falsch");
				break;
			
			default: {
				System.out.println("Zahl ist unbekannt");
			}
				
		}
		
		
		
		
		
		
		
		
		
	}

}
